package teapot.pga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocModel {
    private long start;
    private long end;
//    private File path;
    private List<File> inputs;
    private List<String> errorInputs;
    private long fileCount;
    private long folderCount = 0;
    private long fileCountText;
    private long fileCountBinary;
    private long fileCountUnique;
    private long fileCountIgnored;
    private long fileCountSkiped;
    private List<String> filesIgnored;
    private Map<String, FileModel> results;
    private Map<Integer, SumModel> sum;
    private SumModel total;
    private Options options;
    public LocModel() {
        this.results = new HashMap<String, FileModel>();
        this.sum = new HashMap<Integer, SumModel>();
        this.total = new SumModel();
        this.filesIgnored = new ArrayList<String>();
    }
    public List<File> getInputs() {
        String listFile = this.options.get(Options.LIST_FILE);
//        System.out.println("listFile=" + listFile);
        if (listFile == null) {
            String dir = this.options.get(Options.INPUT_DIR);
//            System.out.println("dir=" + dir);
            if (dir == null) {
                Utils.showUsage();
                return null;
            }
            File filePath = new File(dir);
            if (!filePath.exists()) {
                /*
                 * d:\prj\cloc>C:\tools\cloc\cloc-1.86.exe C:\Users\benju\git\dbjocrx
                 *        0 text files.
                 *        0 unique files.
                 *        0 files ignored.
                 * 1 error:
                 * Unable to read:  C:\Users\benju\git\dbjocrx
                 * d:\prj\cloc>
                 */
                this.errorInputs = new ArrayList<String>();
                this.errorInputs.add(dir);
                return null;
            }
            this.inputs = new ArrayList<File>();
            this.inputs.add(filePath);
            return this.inputs;
        }
        /*
         * d:\prj\cloc>C:\tools\cloc\cloc-1.86.exe --list-file=C:\Users\benju\git\teapot-pga\output\HotKeyHook_LISTx.TXT
         * Unable to read C:\Users\benju\git\teapot-pga\output\HotKeyHook_LISTx.TXT; ignoring.
         *        0 text files.
         *        0 unique files.
         *        0 files ignored.
         * 
         * d:\prj\cloc>
         */
        File filePath = new File(listFile);
        if (!filePath.exists()) {
            System.out.println("Unable to read " + listFile + "; ignoring.");
            return null;
        }
        this.inputs = new ArrayList<File>();
        this.errorInputs = new ArrayList<String>();
        InputStreamReader read = null;
        try {
            read = new InputStreamReader(new FileInputStream(filePath));
        } catch (FileNotFoundException e1) {
            System.out.println("Unable to read " + listFile + "; ignoring.");
            e1.printStackTrace();
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(read);
        String lineTxt = null;
        try {
            while ((lineTxt = bufferedReader.readLine()) != null) {
                File file = new File(lineTxt);
                if (!file.exists()) {
                    /*
                     * d:\prj\cloc>C:\tools\cloc\cloc-1.86.exe --list-file=C:\Users\benju\git\teapot-pga\output\HotKeyHook_LIST.TXT
                     *       60 text files.
                     *       30 unique files.
                     *      389 files ignored.
                     * 
                     * 2 errors:
                     * Unable to read:  C:\Users\benju\git\HotKeyHook\HotKeyHookx
                     * Unable to read:  C:\Users\benju\git\HotKeyHook\HotKeyHookx.zip
                     * 
                     * github.com/AlDanial/cloc v 1.86  T=0.37 s (49.2 files/s, 3025.8 lines/s)
                     * -------------------------------------------------------------------------------
                     * Language                     files          blank        comment           code
                     * -------------------------------------------------------------------------------
                     * Bourne Shell                    11             67            180            292
                     * C++                              1             38             49            174
                     * XML                              2              0              0            157
                     * Perl                             1             19             30             65
                     * C/C++ Header                     2              4              6             24
                     * Markdown                         1              0              0              1
                     * -------------------------------------------------------------------------------
                     * SUM:                            18            128            265            713
                     * -------------------------------------------------------------------------------
                     * 
                     * d:\prj\cloc>
                     */
                    this.errorInputs.add(lineTxt);
                    continue ;
                }
                this.inputs.add(file);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(read!=null) read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return this.inputs;
    }

    public void countFile() {
        this.fileCount ++;
    }
    public void countFileCountText() {
        this.fileCountText ++;
    }
    public void countFileCountBinary() {
        this.fileCountBinary ++;
    }
    public void countFileCountUnique() {
        this.fileCountUnique ++;
    }
    public void countFileCountIgnored() {
        this.fileCountIgnored ++;
    }
    public void countFileCountSkiped() {
        this.fileCountSkiped ++;
    }
    
    public void countFolderCount() {
        this.folderCount ++;
    }
    public void addFile(String fileName, FileModel result) {
        this.results.put(fileName, result);
//        int fileType = result.getFileType();
        // 线程安全
//        SumModel sumInfo = this.sum.get(fileType);
//        if (sumInfo == null) {
//            sumInfo = new SumModel();
//            sumInfo.setFileType(fileType);
//            this.sum.put(fileType, sumInfo);
//        }
//        sumInfo.add(result);
//        this.total.add(result);
    }
    public void addIgnoredFile(String fileName) {
        this.filesIgnored.add(fileName);
    }
}
