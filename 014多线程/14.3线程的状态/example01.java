public class example01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("hello");
        }
        );
        System.out.println("start");
        t1.start();
        t1.join();
        System.out.println("end");
    }
}