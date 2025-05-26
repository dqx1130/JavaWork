/**
 * switch实现石头/剪子/布并判断胜负
 */
import java.util.Scanner;
public class practice01 {
    public static void main(String[] args) {
        System.out.println("please choice:");
        System.out.println(" 1: Rock");
        System.out.println(" 2: Scissors");
        System.out.println(" 3: Paper");
        // 用户输入:
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你的数字");
        choice = sc.nextInt();
        // 计算机随机数 1, 2, 3:
        int random = 1 + (int) (Math.random() * 3);

        switch (choice) {
            // TODO:
            case 1 -> {
                switch (random){
                    case 1 -> System.out.println("平");
                    case 2 -> System.out.println("赢");
                    case 3 -> System.out.println("输");
                }
            }
            case 2 -> {
                switch (random){
                    case 1 -> System.out.println("输");
                    case 2 -> System.out.println("平");
                    case 3 -> System.out.println("赢");
                }
            }
            case 3 -> {
                switch (random){
                    case 1 -> System.out.println("赢");
                    case 2 -> System.out.println("输");
                    case 3 -> System.out.println("平");
                }
            }
        }
    }
}




