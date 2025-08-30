public class example01 {
    public static void main(String[] args) {
        String a = "12";
        String b = "x9";
        // 捕获异常并处理
        int c = 0;
        int d = 0;
        try {
            c = stringToInt(a);
        } catch (NumberFormatException e) {
            System.out.println("无法将 '" + a + "' 转换为整数: " + e.getMessage());
            c = 0; // 设置默认值
        }

        try {
            d = stringToInt(b);
        } catch (NumberFormatException e) {
            System.out.println("无法将 '" + b + "' 转换为整数: " + e.getMessage());
            d = 1; // 设置默认值
        }

        System.out.println(c * d);
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}