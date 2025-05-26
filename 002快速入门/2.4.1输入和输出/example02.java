public class example02 {
    public static void main(String[] args){
        double d = 12900000;
        System.out.println(d);
        double pai = 3.1415926;
        // 保留两位小数输出pai的值
        System.out.printf("%.2f\n", pai);
        // 保留四位小数输出pai的值
        System.out.printf("%.4f\n", pai);
        // 将pai强制转换为整型后输出
        System.out.printf("%d\n", (int) pai);
        // 将pai强制转换为整型后以十六进制输出
        System.out.printf("%x\n", (int) pai);
        // 以科学计数法输出pai的值
        System.out.printf("%e\n", pai);
        // 将pai强制转换为字符型后输出（会截断为char类型对应的ASCII码值）
        System.out.printf("%s\n", (char) pai);    }
}
