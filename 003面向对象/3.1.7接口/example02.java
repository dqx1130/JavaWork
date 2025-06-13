interface Person1{
    String getName();
    default void run(){
        System.out.println(getName() + " run");
    }
}
class Student1 implements Person1{
    private String name;
    public Student1(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

public class example02 {
    public static void main(String[] args){
        Person1 p = new Student1("xiao li");
        p.run();
    }
}
