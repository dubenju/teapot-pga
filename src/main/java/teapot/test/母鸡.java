package teapot.test;

public class 母鸡 implements Runnable{
    NotThreadSafe instance = null;

    public 母鸡(NotThreadSafe instance){
        this.instance = instance;
    }

    public void run() {
        long startTime= System.currentTimeMillis();//开始时间 
        for (int i = 0; i < 10; i ++) {
            System.out.println(">" + Thread.currentThread().getName() + ":" + this.instance.get鸡蛋数量() + "=>");
            this.instance.计数();
            System.out.println("<" + Thread.currentThread().getName() + ":" + this.instance.get鸡蛋数量());
        }
        System.out.println("★" + Thread.currentThread().getName() + ":" + this.instance.get鸡蛋数量() + "执行总时间:" + (System.currentTimeMillis() - startTime));
    }
}
