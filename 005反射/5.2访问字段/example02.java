import java.lang.reflect.Field;
class Person2{
    private String name;
    public Person2(String name){
        this.name = name;
    }
}
public class example02 {
    public static void main(String[] args) throws Exception{
        Object p = new Person2("Xiao Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true); // 关键代码，允许访问私有字段
        Object value = f.get(p);
        System.out.println(value);
    }
}
