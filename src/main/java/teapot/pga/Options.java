package teapot.pga;

import java.io.File;
import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Options {
    public static final String HELP = "--HELP";
    public static final String CSV = "--CSV";
    public static final String CSV_DELIMITER = "--CSV-DELIMITER";
    public static final String ON = "1";
    private File filePath = null; 
    private HashMap<String, String> opts = new HashMap<String, String>();
    public void set(String key, String value) {
        this.opts.put(key, value);
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
}
