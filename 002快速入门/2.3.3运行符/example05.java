public class example05{
    public static void main(String[] args){
        int a = 1;
        ++a;
        System.out.println("a = " + a);
        int b = 1;
        b++;
        System.out.println("b = "+ b);
        int c1 = 10;
        int c2 = 10;
        int d = c1++;
        int e = ++c2;
        System.out.println("d = "+ d);
        System.out.println("e = "+ e);

    }
}