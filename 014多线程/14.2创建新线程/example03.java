public class example03 {
    public static void main(String[] args){
        System.out.println("main start ......");
        Thread t3 = new Thread(){
            public void run(){
                System.out.println("Thread run......");
                System.out.println("Thread finish !");
            }
        };
        t3.start();
        System.out.println("main end!");
    }
}