import java.util.Scanner;
public class practise01 {
    public static void main(String[] args){
        double BMI;
        double height;
        double weight;
        Scanner sc1 = new Scanner(System.in);
        height = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        weight = sc2.nextDouble();
        BMI = weight / (height * height);
        if (BMI < 18.5){
            System.out.println("过轻");
        } else if(BMI < 25){
            System.out.println("正常");
        } else if(BMI < 28){
            System.out.println("过重");
        } else if(BMI < 32){
            System.out.println("肥胖");
        } else{
            System.out.println("非常肥胖");
        }
    }
}
