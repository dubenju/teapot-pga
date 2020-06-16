package teapot.test;

public class NotThreadSafe {
    private long 鸡蛋数量 = 0;
    public void 计数(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.鸡蛋数量 = this.鸡蛋数量 + 1;
    }
    public synchronized void 计数1(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.鸡蛋数量 = this.鸡蛋数量 + 1;
    }
    public long get鸡蛋数量() {
        return this.鸡蛋数量;
    }
    public static void main(String[] args) {
        NotThreadSafe sharedInstance = new NotThreadSafe();

        new Thread(new 母鸡(sharedInstance), "母鸡A").start();
        new Thread(new 母鸡(sharedInstance), "母鸡B").start();
        System.out.println("☆" + Thread.currentThread().getName() + ":" + sharedInstance.get鸡蛋数量());
        
        NotThreadSafe sharedInstance1 = new NotThreadSafe();

        new Thread(new 母鸡1(sharedInstance1), "母鸡1A").start();
        new Thread(new 母鸡1(sharedInstance1), "母鸡1B").start();
        System.out.println("☆" + Thread.currentThread().getName() + ":" + sharedInstance1.get鸡蛋数量());
    }

}
