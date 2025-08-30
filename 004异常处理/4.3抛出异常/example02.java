/**
 * 异常处理示例类
 * 展示了异常的传播和finally块中抛出异常的情况
 */
public class example02 {
    public static void main(String[] args){
        try {
            // 尝试将非数字字符串转换为整数，这会引发NumberFormatException
            Integer.parseInt("abc");
        } catch (Exception e) {
            // 捕获转换过程中产生的异常
            System.out.println("caught"); // 打印"caught"表示异常被捕获
            throw new RuntimeException(e); // 将捕获的异常包装成RuntimeException并重新抛出
                                          // 注意：这个异常会被finally块中的异常覆盖
        } finally {
            // finally块中的代码无论如何都会执行，即使try或catch块中有return语句
            System.out.println("finally"); // 打印"finally"
            throw new IllegalArgumentException(); // 抛出一个新的异常
                                                // 这个异常会覆盖catch块中抛出的异常
                                                // 最终抛出的是这个IllegalArgumentException
        }
    }
}
