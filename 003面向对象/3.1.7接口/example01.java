import java.security.PublicKey;

//抽象方法本质上是定义接口规范：
//即规定高层类的接口，从而保证所有子类都有相同的接口实现，
//这样，多态就能发挥出威力。
interface Person{
    void run();
    String getName();
}
interface Hello{
    void hello();
}
class Student implements Person,Hello{
    private String name;
    public Student(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println(this.name + " run");
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void hello(){
        System.out.println(this.name + " ,hello");
    }
}
public class example01 {
    public static void main(String[] args){
        Hello s = new Student("xiaoming");
        s.hello();
        Person p = new Student("xiaohong");
        p.run();
    }
}
