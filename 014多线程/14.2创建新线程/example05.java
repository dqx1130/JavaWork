class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
    }
}

public class example05 {
    public static void main(String[] args){
        Thread t5 = new MyThread();
        t5.run();
    }
}
