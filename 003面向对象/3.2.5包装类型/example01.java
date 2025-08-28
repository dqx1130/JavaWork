// 自定义的 Integer1 类，模拟包装类
class Integer1 {
    private int value; // 用于存储整数值

    // 构造方法，传入一个 int 类型的值
    public Integer1(int value) {
        this.value = value;
    }

    // 获取当前对象中存储的 int 值
    public int intValue() {
        return this.value;
    }
}

public class example01 {
    public static void main(String[] args) {
        Integer1 n = null;            // 定义一个 Integer 类型变量并赋值为 null
        Integer1 n2 = new Integer1(99); // 创建一个新的 Integer 对象，值为99
        int n3 = n2.intValue();      // 调用 intValue 方法，获取 n2 中的 int 值
    }
}