public class example05 {
    public static void main(String[]  args){
        Thread s1 = new  MyThread1();
        s1.start();

    }
}
class MyThread1 extends Thread{
    @Override
    public void run(){
        int res = 0;
        for (int i = 1 ; i <= 50 ;  i +=2){
            res += i;
        }
        System.out.println("Sum1 "+ res);
    }
}

