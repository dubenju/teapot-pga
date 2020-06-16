package teapot.test;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadException {

    public static void main(String[] args) {
        Thread t = new Thread();
        t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("catch");
                
            }
            
        });
        t.start();
    }

}
