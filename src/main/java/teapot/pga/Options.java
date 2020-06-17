package teapot.pga;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Options {
    public static final String HELP = "--HELP";
    // input
    public static final String LIST_FILE = "--LIST-FILE";
    private boolean hasListFile = false;
    public static final String INPUT_DIR = "--INPUT-DIR";

    // filter
    public static final String EXCLUDE_DIR = "--EXCLUDE-DIR";
    public static final String CSV = "--CSV";
    public static final String CSV_DELIMITER = "--CSV-DELIMITER";
    public static final String JSON = "--JSON";
    public static final String MD = "--MD";
    public static final String XML = "--XML";
    public static final String YAML = "--YAML";
    /* default: BY_LANG */
    public static final String BY_LANG = "--BY-LANG";
    public static final String BY_FILE = "--BY-FILE";
    public static final String BY_FILE_BY_LANG = "--BY-FILE-BY-LANG";
    public static final String ON = "1";
    // output
    public static final String IGNORED = "--IGNORED";
    public static final String FOUND = "--FOUND";
    public static final String CATEGORIZED = "--CATEGORIZED";
    public static final String COUNTED = "--COUNTED";
    public static final String REPORT_FILE = "--REPORT-FILE"; // REPORT_FILE和OUT后预先
    public static final String OUT = "--OUT";

    private File filePath = null; 
    private HashMap<String, String> opts = new HashMap<String, String>();
    public void set(String key, String value) {
        this.opts.put(key, value);
    }
    public void remove(String key) {
        this.opts.remove(key);
    }
    public String get(String key) {
        return this.opts.get(key);
    }
    public boolean isCsv() {
        return Options.ON.equals(this.opts.get(Options.CSV));
    }
    public String getCsvDelimiter() {
        if(isCsv() == false) {
            return "";
        }
        String res = this.opts.get(Options.CSV_DELIMITER);
        if (res == null || res.length() <= 0) {
            return ",";
        }
        return res;
    }
    public boolean isJson() {
        return Options.ON.equals(this.opts.get(Options.JSON));
    }
    public boolean isMd() {
        return Options.ON.equals(this.opts.get(Options.MD));
    }
    public boolean isXml() {
        return Options.ON.equals(this.opts.get(Options.XML));
    }
    public boolean isYaml() {
        return Options.ON.equals(this.opts.get(Options.YAML));
    }
    public boolean isByFile() {
        return Options.ON.equals(this.opts.get(Options.BY_FILE));
    }
    public boolean isByLang() {
        return Options.ON.equals(this.opts.get(Options.BY_LANG));
    }
    public String getOutCategorized() {
        return this.opts.get(Options.CATEGORIZED);
    }
    public String getOutCounted() {
        return this.opts.get(Options.COUNTED);
    }
    public String getOutFound() {
        return this.opts.get(Options.FOUND);
    }
    public String getOutIgnored() {
        return this.opts.get(Options.IGNORED);
    }
    public String getOutReportFile() {
       
        return this.opts.get(Options.REPORT_FILE);
    }
    public List<String> getExcludeDirs() {
        ArrayList<String> result = new ArrayList<String>();
        String str = this.opts.get(Options.EXCLUDE_DIR);
        if (str == null || str.length() <= 0) {
            result.add(".svn");
            result.add(".cvs");
            result.add(".hg");
            result.add(".git");
            result.add(".bzr");
            result.add(".snapshot");
            result.add(".config");
            result.add(".settings");
        } else {
            String[] ary = str.split(",");
            for(String s : ary) {
                if (s != null && s.trim().length() > 0) {
                    result.add(s.trim());
                }
            }
        }
        return result;
    }

}
