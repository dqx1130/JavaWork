/**
 * 本类演示如何使用Java反射API获取类的信息
 * Class类是Java反射的核心，它提供了访问类的元数据的方法
 */
public class example01 {
    /**
     * 打印Class对象的各种信息
     * @param cls 要分析的Class对象
     */
    static void printClassInfo(Class cls){
        // 获取并打印类的完全限定名称(包含包名)
        System.out.println("Class name: "+ cls.getName());
        // 获取并打印类的简单名称(不包含包名)
        System.out.println("Simple name: " + cls.getSimpleName());
        // 检查类是否有包，如果有则打印包名
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        // 判断并打印该类是否是接口
        System.out.println("is interface: " + cls.isInterface());
        // 判断并打印该类是否是枚举类型
        System.out.println("is enum: " + cls.isEnum());
        // 判断并打印该类是否是数组类型
        System.out.println("is array: " + cls.isArray());
        // 判断并打印该类是否是基本数据类型
        System.out.println("is primitive: " + cls.isPrimitive());
    }

    /**
     * 主方法，演示不同类型的Class对象信息
     * @param args 命令行参数
     */
    public static void main(String[] args){
        // 获取String类的Class对象并打印信息
        printClassInfo("".getClass());
        // 获取Runnable接口的Class对象并打印信息
        printClassInfo(Runnable.class);
        // 获取Month枚举的Class对象并打印信息
        printClassInfo(java.time.Month.class);
        // 获取String数组类型的Class对象并打印信息
        printClassInfo(String[].class);
        // 获取int基本类型的Class对象并打印信息
        printClassInfo(int.class);
    }
}