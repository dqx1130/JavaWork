import java.util.Scanner;
public class example03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象用于接收用户输入
        System.out.print("Input your name :"); // 提示用户输入姓名
        String name = scanner.nextLine(); // 读取用户输入的姓名
        System.out.print("Input your age :"); // 提示用户输入年龄
        int age = scanner.nextInt(); // 读取用户输入的年龄
        System.out.printf("Hi,%s,you are %d\n",name,age); // 使用printf格式化输出问候语和年龄
    }
}
