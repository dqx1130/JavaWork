class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Oh,man!");
    }
}

public class example02 {
    public static void main(String[] args){
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
