//编写一个具有两个线程的程序，
//第一个线程求10~20之间的素数以及它们的和，
//第二个线程求1000~2000之间的素数以及它们的和。
class SumPrime{
    int s;
    int e;
    public SumPrime(int s , int e){
        this.s = s;
        this.e = e;
    }
    public int getS(){
        return s;
    }
    public boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        for(int i = 3; i  <= ((int)Math.sqrt(n)) + 1 ; i ++ ) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void print() {
        System.out.print("素数是：");
        for (int i = this.s; i <= this.e; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public int countSum(){
        int res = 0;
        for (int i = this.s ;i <= this.e; i++){
            if(isPrime(i)){
                res += i;
            }
        }
        return res;
    }
}
class MyThread extends Thread{
    int s;
    int e;
    public MyThread(int s, int e){
        this.s = s;
        this.e = e;
    }
    @Override
    public void run(){
        SumPrime r = new SumPrime(s,e);
        r.print();
        System.out.println(r.countSum());
    }
}

public class example03 {
    public static void main(String[] args){
        Thread t1 = new MyThread(10,20);
        Thread t2 = new MyThread(1000,2000);
        t1.start();
        t2.start();

    }
}
