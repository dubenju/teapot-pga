package teapot.pga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
            analyzeFile();
        }
    }

    public void analyzeFile() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(this.file));
            // 判断此行是否为注释行
            boolean comment = false;
            String line = "";
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.matches("^[\\s&&[^\\n]]*$")) {
                    // 空行
                    this.result.countWhiteLines();
                }else if (line.startsWith("/*") && line.endsWith("*/")) {
                    // 判断此行为"/*xxx*/"的注释行
                    this.result.countCommentLines();
                } else if (line.startsWith("/*") && !line.endsWith("*/")) {
                    // 判断此行为"/*"开头的注释行
                    this.result.countCommentLines();
                    comment = true;
                } else if (comment == true && !line.endsWith("*/")) {
                    // 为多行注释中的一行（不是开头和结尾）
                    this.result.countCommentLines();
                } else if (comment == true && line.endsWith("*/")) {
                    // 为多行注释的结束行
                    this.result.countCommentLines();
                    comment = false;
                } else if (line.startsWith("//")) {
                    // 单行注释行
                    this.result.countCommentLines();
                } else {
                    // 正常代码行
                    this.result.countNormalLines();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                    br = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
