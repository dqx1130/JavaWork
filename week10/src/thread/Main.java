package thread;
public class Main {
    public static void main(String[] args) {
        System.out.println("Main中的main()方法开始执行");
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main中的main()方法结束执行");
    }
}
