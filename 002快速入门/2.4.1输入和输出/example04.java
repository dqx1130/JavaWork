import java.util.Scanner;
public class example04 {
    public static void main(String[] args){
        int lastScore;
        Scanner sc1 = new Scanner(System.in);
        lastScore = sc1.nextInt();
        int thisScore;
        Scanner sc2 = new Scanner(System.in);
        thisScore = sc2.nextInt();
        double up;
        up = ((double) (thisScore - lastScore) / (double)lastScore) * 100;
        System.out.printf("提升了%.2f%%",up);
    }
}
