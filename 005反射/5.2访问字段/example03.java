import java.lang.reflect.Field;

class Person3{
    private String name;
    public Person3(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

public class example03{
    public static void  main(String[] args) throws Exception{
        Person3 p = new Person3("XiaoMing");
        System.out.println(p.getName());
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p,"XiaoHong");
        System.out.println(p.getName());
    }
}