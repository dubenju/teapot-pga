package teapot.pga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Report {
    public static void report(LocModel model) {
        System.out.println(Utils.formatNumber(model.getFileCountText(), 10) + " text files.");
        System.out.println(Utils.formatNumber(model.getFileCountUnique(), 10) + " unique files.");
        System.out.println(Utils.formatNumber(model.getFileCountIgnored(), 10) + " files ignored.");
        System.out.println("");
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
    }
    public static void reportCsv(LocModel model, String delimiter) {
        System.out.println(Utils.formatNumber(model.getFileCountText(), 10) + " text files.");
        System.out.println(Utils.formatNumber(model.getFileCountUnique(), 10) + " unique files.");
        System.out.println(Utils.formatNumber(model.getFileCountIgnored(), 10) + " files ignored.");
        System.out.println("");
        BigDecimal times = new BigDecimal((System.currentTimeMillis() - model.getStart() + "")).divide(new BigDecimal("1000"), 1, BigDecimal.ROUND_HALF_UP);
        BigDecimal files = new BigDecimal(model.getFileCount() + "").divide(times, 1, BigDecimal.ROUND_HALF_UP);
        BigDecimal lines = new BigDecimal(model.getTotal().getLines() + "").divide(times, 1, BigDecimal.ROUND_HALF_UP);
        System.out.println("files,language,blank,comment,code,\"dbjcloc v 1.00  T=" + times +" s (" + files + " files/s, " + lines + " lines/s)\"");
        List<Integer> keys = new ArrayList<Integer>();
        keys.addAll(model.getSum().keySet());
        Collections.sort(keys);
        for(int key : keys) {
            SumModel sum = model.getSum().get(key);
            System.out.println(sum.getFiles() + "," +
                    Utils.getLanguageName(sum.getFileType()) + "," +
                    sum.getWhiteLines() + "," +
                    sum.getCommentLines()+ "," +
                    sum.getNormalLines());
        }
        SumModel sum = model.getTotal();
        System.out.println(sum.getFiles() + ",SUM," +
                sum.getWhiteLines() + "," +
                sum.getCommentLines()+ "," +
                sum.getNormalLines());
    }
}
