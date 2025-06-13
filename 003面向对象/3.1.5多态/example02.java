class Person2{
    public void run() {
        System.out.println("Person.run");
    }
}
class Student2 extends Person2{
    @Override
    public void run(){
        System.out.println("Student.run");
    }
}
public class example02 {
    public static void  main(String[] args){
        Person2 s = new Student2();
        s.run();
    }
}
