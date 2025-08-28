import java.beans.*;

// 定义一个Person2类，具有name和age属性
class Person2 {
    // 姓名属性
    private String name;
    // 年龄属性
    private int age;

    // 获取姓名
    public String getName() {
        return name;
    }

    // 设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }
}

public class example02 {
    public static void main(String[] args) throws Exception{
        // 获取Person2类的Bean信息
        BeanInfo info = Introspector.getBeanInfo(Person2.class);
        // 遍历所有属性描述器，输出属性名及其getter/setter方法
        for (PropertyDescriptor pd : info.getPropertyDescriptors()){
            System.out.println(pd.getName()); // 输出属性名
            System.out.println("  " + pd.getReadMethod()); // 输出getter方法
            System.out.println("  " + pd.getWriteMethod()); // 输出setter方法
        }
    }
}