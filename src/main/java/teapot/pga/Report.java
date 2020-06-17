package teapot.pga;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Report {
    public static void reportCommon(LocModel model) {
        System.out.println(Utils.formatNumber(model.getFileCountText(), 10) + " text files.");
        String found = model.getOptions().getOutFound();
        if (found != null && found.length() > 0) {
            System.out.println("Wrote   " + found);
            Utils.writeFile(Options.FOUND, model);
        }
        String categorized = model.getOptions().getOutCategorized();
        if (categorized != null && categorized.length() > 0) {
            Utils.writeFile(Options.CATEGORIZED, model);
        }
        System.out.println(Utils.formatNumber(model.getFileCountUnique(), 10) + " unique files.");
        System.out.println(Utils.formatNumber(model.getFileCountIgnored(), 10) + " files ignored.");
        String ignored = model.getOptions().getOutIgnored();
        if (ignored != null && ignored.length() > 0) {
            System.out.println("Wrote   " + ignored);
            Utils.writeFile(Options.IGNORED, model);
        }
        String counted = model.getOptions().getOutCounted();
        if (counted != null && counted.length() > 0) {
            System.out.println("Wrote   " + counted);
            Utils.writeFile(Options.COUNTED, model);
        }

        System.out.println(Utils.formatNumber(model.getFileCountBinary(), 10) + " binary files.");
        System.out.println(Utils.formatNumber(model.getFileCountSkiped(), 10) + " folders/files skiped(WARNING).");
        System.out.println(Utils.formatNumber(model.getFolderCount(), 10) + " folders.");
        // --out=D:\prj\cloc\dbjocr_out.txt
        // Wrote D:\prj\cloc\dbjocr_out.txt
        String reportFile = model.getOptions().getOutReportFile();
        if (reportFile != null && reportFile.length() > 0) {
            System.out.println("Wrote   " + reportFile);
        }
        System.out.println("");
    }
    public static void report(LocModel model) {
        reportCommon(model);
        PrintStream out = System.out;
        try {
            String reportFile = model.getOptions().getOutReportFile();
            PrintStream ps = new PrintStream(new FileOutputStream(new File(reportFile)));
            System.setOut(ps);//  System.setOut();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BigDecimal times = new BigDecimal((System.currentTimeMillis() - model.getStart() + "")).divide(new BigDecimal("1000"), 1, BigDecimal.ROUND_HALF_UP);
        BigDecimal files = new BigDecimal(model.getFileCount() + "").divide(times, 1, BigDecimal.ROUND_HALF_UP);
        BigDecimal lines = new BigDecimal(model.getTotal().getLines() + "").divide(times, 1, BigDecimal.ROUND_HALF_UP);
        System.out.println("dbjcloc v 1.00  T=" + times +" s (" + files + " files/s, " + lines + " lines/s)");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Language                     files          blank        comment           code");
        System.out.println("-------------------------------------------------------------------------------");
        List<Integer> keys = new ArrayList<Integer>();
        keys.addAll(model.getSum().keySet());
        Collections.sort(keys);
        for(int key : keys) {
            SumModel sum = model.getSum().get(key);
            System.out.println(Utils.formatString(Utils.getLanguageName(sum.getFileType()), 24) + 
                    Utils.formatNumber(sum.getFiles(), 10) + 
                    Utils.formatNumber(sum.getWhiteLines(), 14) +
                    Utils.formatNumber(sum.getCommentLines(), 14) + 
                    Utils.formatNumber(sum.getNormalLines(), 14));
        }
        System.out.println("-------------------------------------------------------------------------------");
        SumModel sum = model.getTotal();
        System.out.println(Utils.formatString("SUM:", 24) + 
                Utils.formatNumber(sum.getFiles(), 10) + 
                Utils.formatNumber(sum.getWhiteLines(), 14) +
                Utils.formatNumber(sum.getCommentLines(), 14) + 
                Utils.formatNumber(sum.getNormalLines(), 14));
        System.out.println("-------------------------------------------------------------------------------");
        System.setOut(out);
    }

    public static void reportCsv(LocModel model) {
        reportCommon(model);
        PrintStream out = System.out;
        try {
            String reportFile = model.getOptions().getOutReportFile();
            PrintStream ps = new PrintStream(new FileOutputStream(new File(reportFile)));
            System.setOut(ps);//  System.setOut();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Options opts = model.getOptions();
        String delimiter = opts.getCsvDelimiter();
        BigDecimal times = new BigDecimal((System.currentTimeMillis() - model.getStart() + "")).divide(new BigDecimal("1000"), 1, BigDecimal.ROUND_HALF_UP);
        BigDecimal files = new BigDecimal(model.getFileCount() + "").divide(times, 1, BigDecimal.ROUND_HALF_UP);
        BigDecimal lines = new BigDecimal(model.getTotal().getLines() + "").divide(times, 1, BigDecimal.ROUND_HALF_UP);

        int print = 0;
        boolean bByfile = opts.isByFile();
        if (bByfile == true) {
            System.out.println("language" + delimiter + "filename" + delimiter + "blank" + delimiter + "comment" + delimiter + "code" + delimiter + "\"dbjcloc v 1.00 T=" + times +" s (" + files + " files/s, " + lines + " lines/s)\" a");
            print ++;
            List<FileModel> values = new ArrayList<FileModel>();
            values.addAll(model.getResults().values());
            Collections.sort(values, new Comparator<FileModel>(){
                public int compare(FileModel arg0, FileModel arg1) {
                    int res = arg0.getFileType() - arg1.getFileType();
                    if (res == 0) {
                        res = arg0.getFileName().compareTo(arg1.getFileName());
                    }
                    return res;
                }
            });
            for(FileModel sum : values) {
                System.out.println(Utils.getLanguageName(sum.getFileType()) + delimiter +
                        sum.getFileName() + delimiter +
                        sum.getWhiteLines() + delimiter +
                        sum.getCommentLines()+ delimiter +
                        sum.getNormalLines());
            }
            SumModel sum = model.getTotal();
            System.out.println("SUM" + delimiter + delimiter +
                    sum.getWhiteLines() + delimiter +
                    sum.getCommentLines()+ delimiter +
                    sum.getNormalLines());
        }
        boolean bByLang = opts.isByLang();
        if (bByLang == true) {
            System.out.println("files" + delimiter + "language" + delimiter + "blank" + delimiter + "comment" + delimiter + "code" + (print == 0 ? delimiter + "\"dbjcloc v 1.00 T=" + times +" s (" + files + " files/s, " + lines + " lines/s)" : ""));
            List<Integer> keys = new ArrayList<Integer>();
            keys.addAll(model.getSum().keySet());
            Collections.sort(keys);
            for(int key : keys) {
                SumModel sum = model.getSum().get(key);
                System.out.println(sum.getFiles() + delimiter +
                        Utils.getLanguageName(sum.getFileType()) + delimiter +
                        sum.getWhiteLines() + delimiter +
                        sum.getCommentLines()+ delimiter +
                        sum.getNormalLines());
            }
            SumModel sum = model.getTotal();
            System.out.println(sum.getFiles() + delimiter + "SUM" + delimiter + 
                    sum.getWhiteLines() + delimiter +
                    sum.getCommentLines()+ delimiter +
                    sum.getNormalLines());
        }
        System.setOut(out);
    }
}
