// 链式操作示例
public class example03 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        // 通过链式调用连续进行加法和自增操作
        adder.add(3)    // 加3
                .add(5)    // 再加5
                .inc()     // 自增1
                .add(10);  // 再加10
        System.out.println(adder.value());  // 输出当前累加值
    }
}
// 定义一个累加器类
class Adder {
    private int sum = 0;  // 累加和，初始为0
    // 加指定的数，并返回当前对象以实现链式调用
    public Adder add(int n) {
        sum += n;
        return this;
    }
    // 自增1，并返回当前对象以实现链式调用
    public Adder inc() {
        sum ++;
        return this;
    }
    // 返回当前累加值
    public int value() {
        return sum;
    }
}