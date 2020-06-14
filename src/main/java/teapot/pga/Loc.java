package teapot.pga;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

public class Loc {

    public static void main(String[] args) {
        File filePath = null; 
        System.out.println("main");
        Loc proc = new Loc();
        for(int i = 0; i < args.length; i ++) {
            String arg = args[i];
            System.out.println(arg);
            if (i == 0) {
                filePath = new File(arg);
                if (!filePath.exists()) {
                    System.out.println("指定的对象不存在。");
                    return ;
                }
            }
        }
        if (filePath == null) {
            System.out.println("指定的对象不存在。");
            return ;
        }
        proc.proc(filePath);
        System.out.println("end");
    }

    public void proc(File path) {
//        System.out.println(path);

        File[] fs = path.listFiles();
        for(File f:fs){
            if(f.isDirectory()) {
                //若是目录，则递归打印该目录下的文件
                proc(f);
            }

            if(f.isFile()) {
                //若是文件，直接打印
                String contentType = null;
                InputStream is = null;
                try {
                    is = new BufferedInputStream(new FileInputStream(f));
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                try {
                    contentType = URLConnection.guessContentTypeFromStream(is);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println((isBinary(f) ? "二进制文件" : "文本文件") + ":" + f);
            }
        }
    }

    public static boolean isBinary(File file) {
        boolean isBinary = false;
        try {
            FileInputStream fin = new FileInputStream(file);
            long len = file.length(); 
            for (int j = 0; j < (int) len; j++) {
                int t = fin.read();
                if (t < 32 && t != 9 && t != 10 && t != 13) {
                    isBinary = true;
                    break;
                }
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isBinary;
    }

}
