package calc;
import java.util.Random;
public class Main
{
    public static void generateMathExercises(int num) {
        Random random = new Random();
        for (int i = 0 ; i < num;i++){
            int equationType = random.nextInt(2);
            if (equationType == 0){
                int a = random.nextInt(100)+1;
                int b = random.nextInt(100)+1;
                int op = random.nextInt(2);
                if (op == 0){
                    System.out.println(a + " + " + b + " = ?");
                } else {
                    System.out.println(a + " - " + b + " = ?");
                }
            }else{
                int a = random.nextInt(20)+1;
                int b = random.nextInt(20)+1;
                int op = random.nextInt(2);
                if (op == 0){
                    System.out.println(a + " * " + b + " = ?");
                } else {
                    System.out.println(a + " / " + b + " = ?");
                }
            }
            if (i % 5 == 0){
                System.out.println();
            }
        }
    }
}

