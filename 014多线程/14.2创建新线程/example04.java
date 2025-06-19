public class example04 {
    public static void main(String[] args){
        System.out.println("main start ...");
        Thread t4 = new Thread(){
            public void run(){
                System.out.println("Thread start ....");

                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    System.out.println("Thread end !!!");
                }
            }
        };
        t4.start();
        try{
            Thread.sleep(20);
        }catch(InterruptedException e ){
            System.out.println("main end!!!");
        }
    }
}
