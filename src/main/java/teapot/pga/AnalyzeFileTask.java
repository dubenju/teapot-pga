package teapot.pga;

import java.io.File;

public class AnalyzeFileTask implements Runnable {
    private File file;
    private FileModel result;

    public AnalyzeFileTask(String taskName, File file) {
        this.file = file;
        this.result = new FileModel();
        this.result.setFileName(this.file.getAbsolutePath());
    }
    public AnalyzeFileTask(String taskName, File file, FileModel result) {
        this.file = file;
        this.result = result;
        this.result.setFileName(this.file.getAbsolutePath());
    }

    @Override
    public void run() {
        this.result.setWhiteLines(0);//空白行数
        this.result.setCommentLines(0);//注释行数
        this.result.setNormalLines(0); //有效程序行数

        boolean isBinary = Utils.isBinary(this.file);
        if (isBinary == true) {
            this.result.setFileType(Loc.BINARY_ID);
        } else {
            this.result.setFileType(Loc.TEXT_ID);
        }
        Analyzer analyzer = Analyzers.getAnalyzer(this.result.getFileType());
        analyzer.analyzeFile(file, result);
    }

}
