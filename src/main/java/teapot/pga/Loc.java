package teapot.pga;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Loc {
    public static  final int TEXT_ID = 10000;
    public static  final int BINARY_ID = 20000;
    public static final int PROCESSORS = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        LocModel model = new LocModel();
        model.setStart(start);

        Options opts = new Options();
        opts.set(Options.BY_LANG, Options.ON); // default
        model.setOptions(opts);
        if(OptionsParser.parse(args, opts) == null) return;
        List<File> inputFiles = model.getInputs();
        if (inputFiles == null || inputFiles.size() <= 0) {
            return ;
        }

        ExecutorService es = Executors.newFixedThreadPool(PROCESSORS * 2);
        Loc proc = new Loc();
        long fileCount = 0;
        for(File filePath: inputFiles) {
            fileCount += proc.proc(filePath, es, model);
        }
        // 关闭线程池:
        es.shutdown();
        try {
            while (!es.awaitTermination(1, TimeUnit.SECONDS)) { }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        model.setEnd(end);
        model.setFileCount(fileCount);

        // System.out.println("文件数：" + fileCount + " vs " + model.getResults().keySet().size());
        Map<Integer, SumModel> sum = model.getSum();
        SumModel total = model.getTotal();
        for(String key : model.getResults().keySet()) {
            FileModel fileInfo = model.getResults().get(key);
            int fileType = fileInfo.getFileType();
            SumModel sumInfo = sum.get(fileType);
            if (sumInfo == null) {
                sumInfo = new SumModel();
                sumInfo.setFileType(fileType);
                sum.put(fileType, sumInfo);
            }
            sumInfo.add(fileInfo);
            total.add(fileInfo);
            if (fileType < Loc.BINARY_ID) {
                model.countFileCountText();
            } else {
                model.countFileCountBinary();
            }
        }

        if (opts.isCsv()) {
            Report.reportCsv(model);
        } else if (opts.isJson()) {
        } else if (opts.isMd()) {
        } else if (opts.isXml()) {
        } else if (opts.isYaml()) {
        } else {
            Report.report(model);
        }
        end = System.currentTimeMillis();
        System.out.println("共计耗时：" + (double)(Math.round(end - start)/ 1000.0D) + "秒");
    }

    public long proc(File path, ExecutorService es, LocModel model) {
        long res = 0;
        if (OptionsParser.isSkip(path, model.getOptions())) {
            model.countFileCountSkiped();
            return res;
        }
        if(path.isDirectory()) {
            File[] fs = path.listFiles();
            for(File f:fs){
                if(f.isDirectory()) {
                    //若是目录，则递归打印该目录下的文件
                    model.countFolderCount();
                    res += proc(f, es, model);
                }
    
                if(f.isFile()) {
                    if (f.length() <= 0) {
                        // zero sized file is ignored.
                        model.countFileCountIgnored();
                        model.addIgnoredFile(f.getAbsolutePath());
                        continue ;
                    }
                    res ++;
                    String fileName = f.getAbsolutePath();
                    FileModel result = new FileModel(fileName);
                    result.setFileSize(f.length());
                    model.addFile(fileName, result);
                    es.submit(new AnalyzeFileTask(fileName, f, result));
                }
            }
        }
        if(path.isFile()) {
            if (path.length() <= 0) {
                // zero sized file is ignored.
                model.countFileCountIgnored();
                model.addIgnoredFile(path.getAbsolutePath());
                return res;
            }
            res ++;
            String fileName = path.getAbsolutePath();
            FileModel result = new FileModel(fileName);
            result.setFileSize(path.length());
            model.addFile(fileName, result);
            es.submit(new AnalyzeFileTask(fileName, path, result));
        }
        return res;
    }

}
