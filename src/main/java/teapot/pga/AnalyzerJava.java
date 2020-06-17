package teapot.pga;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnalyzerJava extends AnalyzerBinary {

    @Override
    public void analyzeFile(File file, FileModel result) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            // 判断此行是否为注释行
            boolean comment = false;
            String line = "";
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.matches("^[\\s&&[^\\n]]*$")) {
                    // 空行
                    result.countWhiteLines();
                } else if (line.startsWith("/*") && line.endsWith("*/")) {
                    // 判断此行为"/*xxx*/"的注释行
                    result.countCommentLines();
                } else if (line.startsWith("/*") && !line.endsWith("*/")) {
                    // 判断此行为"/*"开头的注释行/*
                    result.countCommentLines();
                    comment = true;
                } else if (comment == true && !line.endsWith("*/")) {
                    // 为多行注释中的一行（不是开头和结尾）
                    result.countCommentLines();
                } else if (comment == true && line.endsWith("*/")) {
                    // 为多行注释的结束行
                    result.countCommentLines();
                    comment = false;
                } else if (comment == true && line.indexOf("*/") >= 0) {
                    // 为多行注释的结束行 */xxx
                    result.countNormalLines();
                    comment = false;
                } else if (line.startsWith("//")) {
                    // 单行注释行
                    result.countCommentLines();
                } else if (line.indexOf("/*") >= 0 && !line.endsWith("*/")) {
                    // 判断此行为"xxx/*"开头的注释行
                    result.countNormalLines();
                    comment = true;
                } else {
                    // 正常代码行
                    result.countNormalLines();
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
