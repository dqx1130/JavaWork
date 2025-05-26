public class example02 {
    public static void main(String[] args){
        double x = 1 - 9.0 / 10;
        //浮点数在计算机中无法精确表示
        if(x == 0.1){
            System.out.println("x is 0.1");
        } else{
            System.out.println("x is NOT 0.1");
        }
        System.out.println("--------------------------------------");
        //利用差值小于某个临界值来表示
        if (Math.abs( x - 0.1 ) < 0.000001){
            System.out.println("x is 0.1");
        }else{
            System.out.println("x is NOT 0.1");
        }
    }
}
