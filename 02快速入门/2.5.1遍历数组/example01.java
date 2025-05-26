import java.util.Arrays;
public class example01 {
    public static void main(String[] args){
        int []ns = {1,2,3,4,5,6};
        for (int n : ns){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ns));
    }
}
