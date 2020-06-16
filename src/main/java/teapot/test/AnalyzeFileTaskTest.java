package teapot.test;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import teapot.pga.AnalyzeFileTask;

public class AnalyzeFileTaskTest {

    public static void main(String[] args) {
        // 创建一个固定大小的线程池:
        File file = new File("C:/Users/benju/git/dbjocr/src/main/java/dbjocr/utils/URGBColor.java");
        ExecutorService es = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 1; i++) {
            es.submit(new AnalyzeFileTask("" + i, file));
        }
        // 关闭线程池:
        es.shutdown();
    }

}
