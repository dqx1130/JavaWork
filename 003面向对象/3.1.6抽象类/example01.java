//上层代码只定义规范（例如：abstract class Person）；
//不需要子类就可以实现业务逻辑（正常编译）；
//具体的业务逻辑由不同的子类实现，调用者并不关心。
abstract class Person1{
    public abstract void run();
}
class Student1 extends Person1{
    @Override
    public void run(){
        System.out.println("Student.run");
    }
}
public class example01 {
    public static void main(String[] args){
        //面向抽象编程
        Person1 p = new Student1();
        p.run();
    }
}
