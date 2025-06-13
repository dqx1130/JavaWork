/**
 * 父类 Person1
 * 定义了所有“人”共有的属性和行为。
 */
class Person1 {
    // 字段声明为 protected，意味着本类和其所有子类都可以直接访问。
    protected String name;
    protected int age;

    /**
     * Person1 的构造方法。
     * 负责初始化一个 Person1 对象所必须的 name 和 age 字段。
     * @param name 姓名
     * @param age 年龄
     */
    public Person1(String name, int age) {
        this.age = age;
        this.name = name;
    }

    /**
     * 重写了 Object 类的 toString 方法，用于返回对象的字符串表示。
     * 这是 Person1 对象的“自我介绍”方式。
     * @return 包含姓名和年龄的字符串
     */
    @Override
    public String toString() {
        return "姓名：" + this.name + "，年龄：" + this.age;
    }
}

/**
 * 子类 Student1，继承自 Person1。
 * 它拥有 Person1 的所有属性和方法，并添加了自己独有的 score 字段和行为。
 */
class Student1 extends Person1 {
    // Student1 类独有的字段：分数。
    protected int score;

    /**
     * Student1 的构造方法。
     * @param name 姓名 (将传递给父类)
     * @param age 年龄 (将传递给父类)
     * @param score 分数 (由本类自己初始化)
     */
    public Student1(String name, int age, int score) {
        // 【知识点 1: super() 调用父类构造方法】
        // 这一行必须是子类构造方法的第一行！
        // 它的作用是调用父类 Person1 的构造方法，并将 name 和 age 传递过去。
        // 这样做是为了先完成父类部分的初始化（打好“地基”），然后才能初始化子类自己的部分。
        // 因为 Person1 没有无参数的构造方法，所以这个调用是强制性的，不能省略。
        super(name, age);

        // 初始化子类自己独有的字段。
        this.score = score;
    }

    /**
     * 【知识点 2: @Override 注解】
     * 这个注解告诉编译器，下面的 toString 方法确定是要“重写”父类的同名方法。
     * 它像一个安全检查员，如果你不小心把方法名写错（如 tostring），编译器就会报错，防止出现隐藏的bug。
     */
    @Override
    public String toString() {
        // 【知识点 3: super.方法() 调用父类方法】
        // super.toString() 会调用父类 Person1 中定义的 toString() 方法。
        // 这样做的好处是“代码复用”和“易于维护”。
        // 我们复用了父类中关于“姓名和年龄”的格式化逻辑，只在此基础上添加自己的“分数”信息。
        // 如果将来 Person1 的介绍方式变了，我们只需要修改 Person1 的代码，Student1 会自动同步更新。
        return super.toString() + "，分数：" + this.score;
    }
}

// 主程序类
public class example02 {
    public static void main(String[] args) {
        // 创建一个 Student1 对象实例。
        // "AK", 12 会通过 super() 传递给 Person1 的构造方法。
        // 140 会被 Student1 自己的构造方法使用。
        Student1 s = new Student1("AK", 12, 140);

        // 【知识点 4: 打印对象与 toString()】
        // 当你试图打印一个对象时 (System.out.println(一个对象))，
        // Java 会自动调用该对象的 toString() 方法，并将返回的字符串打印出来。
        // 此处会调用 Student1 类中重写后的 toString() 方法。
        System.out.println(s);
    }
}