class myThread extends Thread{
    @Override
    public void run(){
        System.out.println("mine!");
    }
}

public class example01 {
    public static void main(String[] args){
        Thread t1 = new myThread();
        t1.start();
    }
}
