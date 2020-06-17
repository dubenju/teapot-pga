package teapot.pga;

import java.io.File;
import java.util.List;

public class OptionsParser {
    public static Options parse(String[] args, Options opts) {
        File filePath = null;
        for(int i = 0; i < args.length; i ++) {
            String arg = args[i];
            String val = "";
            int eq = arg.indexOf("=");
            if (eq >= 0) {
                arg = args[i].substring(0, eq);
                val = args[i].substring(eq + 1);
            }
            // System.out.println(arg + "=" + val);
            if(Options.HELP.equalsIgnoreCase(arg)) {
                opts.set(Options.HELP, Options.ON);
                Utils.showUsage();
                return null;
            } else if(Options.CSV.equalsIgnoreCase(arg)) {
                opts.set(Options.CSV, Options.ON);
            } else if(Options.CSV_DELIMITER.equalsIgnoreCase(arg)) {
                opts.set(Options.CSV_DELIMITER, val);
            } else if(Options.JSON.equalsIgnoreCase(arg)) {
                opts.set(Options.JSON, Options.ON);
            } else if(Options.MD.equalsIgnoreCase(arg)) {
                opts.set(Options.MD, Options.ON);
            } else if(Options.XML.equalsIgnoreCase(arg)) {
                opts.set(Options.XML, Options.ON);
            } else if(Options.YAML.equalsIgnoreCase(arg)) {
                opts.set(Options.YAML, Options.ON);
            } else if(Options.BY_FILE.equalsIgnoreCase(arg)) {
                opts.set(Options.BY_FILE, Options.ON);
                opts.remove(Options.BY_LANG);
            } else if(Options.BY_FILE_BY_LANG.equalsIgnoreCase(arg)) {
                opts.set(Options.BY_FILE_BY_LANG, Options.ON);
                opts.set(Options.BY_FILE, Options.ON);
            } else if(Options.IGNORED.equalsIgnoreCase(arg)) {
                opts.set(Options.IGNORED, val);
            } else if(Options.FOUND.equalsIgnoreCase(arg)) {
                opts.set(Options.FOUND, val);
            } else if(Options.CATEGORIZED.equalsIgnoreCase(arg)) {
                opts.set(Options.CATEGORIZED, val);
            } else if(Options.COUNTED.equalsIgnoreCase(arg)) {
                opts.set(Options.COUNTED, val);
            } else if(Options.REPORT_FILE.equalsIgnoreCase(arg)) {
                opts.set(Options.REPORT_FILE, val);
            } else if(Options.OUT.equalsIgnoreCase(arg)) {
                opts.set(Options.REPORT_FILE, val);
            } else if(Options.LIST_FILE.equalsIgnoreCase(arg)) {
                opts.set(Options.LIST_FILE, val);
                opts.setHasListFile(true);
            } else if(Options.EXCLUDE_DIR.equalsIgnoreCase(arg)) {
                opts.set(Options.EXCLUDE_DIR, val);
            }
            if (!arg.startsWith("--") && (!opts.isHasListFile())) {
                filePath = new File(arg);
                if (!filePath.exists()) {
                    System.out.println("指定的对象不存在。");
                    return null;
                }
                opts.set(Options.INPUT_DIR, arg);
            }
        }
        return opts;
    }
    public static boolean isSkip(File file, Options opts) {
        boolean res = false;
        String fileName = file.getAbsolutePath();
        fileName = fileName.replaceAll("\\\\", "/");
        fileName = fileName.replaceAll("\\\\", "/");
//        System.out.println("isSkip:" + fileName);
        List<String> excludeDir = opts.getExcludeDirs();
        for (String dir : excludeDir) {
            String msg = "/" +  dir + "/";
//            System.out.println("isSkip:" + msg);
            if (fileName.indexOf(msg) >= 0) {
                res = true;
                break;
            }
        }
//        System.out.println("isSkip:" + res);
        return res;
    }
}

//if (filePath == null) {
//    System.out.println("指定的对象不存在。");
//    return ;
//}
//model.setPath(filePath);
