package teapot.pga;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FileModel {
    private String fileName = "";
    private long fileSize = 0;
    /**
     * 1:Text/plan
     * 2:BinaryFile
     */
    private int  fileType;
    private long lines = 0; 
    private long whiteLines = 0;//空白行数
    private long commentLines = 0;//注释行数
    private long normalLines = 0; //有效程序行数
    public FileModel() {
    }
    public FileModel(String fileName) {
        this.fileName = fileName;
    }
    public void countWhiteLines() {
        this.whiteLines ++;
        this.lines ++;
    }
    public void countCommentLines() {
        this.commentLines ++;
        this.lines ++;
    }
    public void countNormalLines() {
        this.normalLines ++;
        this.lines ++;
    }
    public void add(FileModel model) {
        this.whiteLines += model.whiteLines;
        this.commentLines += model.commentLines;
        this.normalLines += model.normalLines;
        this.lines += model.lines;
    }
    public void setFileType(int fileType) {
        this.fileType = fileType;
//        if (this.fileType == Loc.TEXT_ID) {
            String extensionName = "";
            int dot = this.fileName.lastIndexOf('.');
            int separator1 = this.fileName.lastIndexOf('\\');
            int separator2 = this.fileName.lastIndexOf('/');
            int separator = Math.max(separator1, separator2);
            if (dot > separator) { 
                extensionName = this.fileName.substring(dot + 1);
                this.fileType = Utils.getExtensionNameId(extensionName.toUpperCase());
                if("xml".equalsIgnoreCase(extensionName)) {
//                    System.out.println(extensionName);
                    String flName = this.fileName.substring(separator + 1, dot);
//                    System.out.println(flName);
                    if ("build".equalsIgnoreCase(flName)) {
                        this.fileType = Utils.getExtensionNameId(this.fileName.substring(separator + 1).toUpperCase());
                    }
                }
            }
//        }
    }
}
