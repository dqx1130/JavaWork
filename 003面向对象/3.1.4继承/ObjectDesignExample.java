// ===================================================================================
// 设计模式一：不可变对象 (Immutable Object)
// ===================================================================================

/**
 * 不可变的人 (ImmutablePerson)
 * 核心思想：对象一旦被创建，其内部状态（字段）就永远不能被改变。
 */
class ImmutablePerson {
    protected final String name; // 使用 final 关键字可以进一步强调其不可变性
    protected final int age;

    /**
     * 【关键点 1】: 通过构造方法强制初始化所有字段。
     * 这是唯一一次可以设置对象状态的机会。
     */
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 【关键点 2】: 只提供 get 方法用于读取数据。
     */
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    /**
     * 【关键点 3】: 不提供任何 set 方法或其他可以修改字段的方法。
     * 从而保证了对象的不可变性。
     * * 优点:
     * 1. 线程安全：可以安全地在多线程环境共享，无需担心数据被篡改。
     * 2. 可预测：状态稳定，代码行为更容易预测，有助于减少bug。
     *
     * 缺点:
     * 1. 灵活性差：每次修改都需要创建一个新对象，可能会有性能开销。
     */
}


// ===================================================================================
// 设计模式二：可变对象 (Mutable Object)，也称 JavaBean 模式
// ===================================================================================

/**
 * 可变的人 (MutablePerson)
 * 核心思想：对象的内部状态可以在其生命周期内被随时修改。
 * 这是一种非常常见的模式，尤其在各种Java框架中。
 */
class MutablePerson {
    protected String name;
    protected int age;

    /**
     * 【关键点 1】: 通常提供一个公共的无参数构造方法。
     * 允许先创建一个“空壳”对象，之后再填充数据。
     */
    public MutablePerson() {
    }

    /**
     * 【关键点 2】: 提供公共的 set 方法，用于在任何时候修改字段。
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 【关键点 3】: 提供公共的 get 方法，用于读取字段。
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * * 优点:
     * 1. 灵活性高：可以方便地更新对象的状态。
     * 2. 框架友好：绝大多数框架（如Spring, Mybatis）都依赖这种模式来操作对象。
     *
     * 缺点:
     * 1. 非线程安全：在多线程环境下需要额外的同步措施来保证数据一致性。
     * 2. 状态不可控：对象容易被无意中修改，可能导致难以追踪的bug。
     */
}


/**
 * 演示了两种常见的设计模式：不可变对象和可变对象。
 * 这个类是 public 的，所以文件名必须是 ObjectDesignExample.java
 */
public class ObjectDesignExample {

    public static void main(String[] args) {
        System.out.println("--- 演示不可变对象 (ImmutablePerson) ---");
        // 1. 不可变对象：必须在创建时提供所有信息。
        ImmutablePerson personA = new ImmutablePerson("张三", 25);
        System.out.println("姓名: " + personA.getName() + ", 年龄: " + personA.getAge());

        // 2. 无法修改！下面的代码会直接编译失败，因为没有 setAge 方法。
        // personA.setAge(26); // COMPILE ERROR!

        // 3. 如果想“修改”，唯一的方法是创建一个全新的对象。
        personA = new ImmutablePerson("张三", 26);
        System.out.println("创建新对象来“更新”年龄后 -> 姓名: " + personA.getName() + ", 年龄: " + personA.getAge());


        System.out.println("\n--- 演示可变对象 (MutablePerson) ---");
        // 1. 可变对象：可以先创建一个“空”对象。
        MutablePerson personB = new MutablePerson();

        // 2. 然后通过 set 方法随时设置或修改其属性。
        personB.setName("李四");
        personB.setAge(30);
        System.out.println("初次设置后 -> 姓名: " + personB.getName() + ", 年龄: " + personB.getAge());

        // 3. 可以随时、随意地修改对象的状态。
        personB.setAge(31);
        System.out.println("修改年龄后 -> 姓名: " + personB.getName() + ", 年龄: " + personB.getAge());
    }
}