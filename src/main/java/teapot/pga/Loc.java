package teapot.pga;

import java.io.File;
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
        model.setOptions(opts);
        File filePath = null;
        for(int i = 0; i < args.length; i ++) {
            String arg = args[i];
            String val = "";
            int eq = arg.indexOf("=");
            if (eq >= 0) {
                arg = args[i].substring(0, eq - 1);
                val = args[i].substring(eq + 1);
            }
            if(Options.HELP.equalsIgnoreCase(arg)) {
                opts.set(Options.HELP, Options.ON);
                Utils.showUsage();
                return ;
            }
            if(Options.CSV.equalsIgnoreCase(arg)) {
                opts.set(Options.CSV, Options.ON);
            }
            if(Options.CSV_DELIMITER.equalsIgnoreCase(arg)) {
                opts.set(Options.CSV_DELIMITER, val);
            }
            if (i == 0) {
                filePath = new File(arg);
                if (!filePath.exists()) {
                    System.out.println("指定的对象不存在。");
                    return ;
                }
            }
        }
        if (filePath == null) {
            System.out.println("指定的对象不存在。");
            return ;
        }
        model.setPath(filePath);

        ExecutorService es = Executors.newFixedThreadPool(PROCESSORS * 3);
        long fileCount = new Loc().proc(filePath, es, model);
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
                //model.countFileCountIgnored();
            }
        }

        if (opts.isCsv()) {
            String delimiter = opts.getCsvDelimiter();
            Report.reportCsv(model, delimiter);
        } else {
            Report.report(model);
        }
        end = System.currentTimeMillis();
        System.out.println("共计耗时：" + (double)(Math.round(end - start)/ 1000.0D) + "秒");
    }

    public long proc(File path, ExecutorService es, LocModel model) {
        long res = 0;
        File[] fs = path.listFiles();
        for(File f:fs){
            if(f.isDirectory()) {
                //若是目录，则递归打印该目录下的文件
                res += proc(f, es, model);
            }

            if(f.isFile()) {
                res ++;
                String fileName = f.getAbsolutePath();
                FileModel result = new FileModel(fileName);
                model.addFile(fileName, result);
                es.submit(new AnalyzeFileTask(fileName, f, result));
            }
        }
        return res;
    }

}
