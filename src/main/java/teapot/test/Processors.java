package teapot.test;

public class Processors {
    public static final int PROCESSORS = Runtime.getRuntime().availableProcessors();
    static {
        
    }
    public static void main(String[] args) {
        System.out.println(PROCESSORS);

    }

}
