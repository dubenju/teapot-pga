package teapot.pga;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocModel {
    private long start;
    private long end;
    private File path;
    private long fileCount;
    private long fileCountText;
    private long fileCountUnique;
    private long fileCountIgnored;
    private Map<String, FileModel> results;
    private Map<Integer, SumModel> sum;
    private SumModel total;
    private Options options;
    public LocModel() {
        this.results = new HashMap<String, FileModel>();
        this.sum = new HashMap<Integer, SumModel>();
        this.total = new SumModel();
    }
    public void countFileCountText() {
        this.fileCountText ++;
    }
    public void countFileCountUnique() {
        this.fileCountUnique ++;
    }
    public void countFileCountIgnored() {
        this.fileCountIgnored ++;
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
}
