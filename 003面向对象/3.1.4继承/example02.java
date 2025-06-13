//必须使用super
class Person1{
    protected String name;
    protected int age;

    public Person1(String name,int age){
        this.age = age;
        this.name = name;
    }
}
class Student1 extends Person1{
    protected int score;
    public Student1(String name , int age ,int score){
        super(name,age);
        this.score = score;
    }
}

public class example02 {
    public static void main(String[] args){
        Student1 s = new Student1("AK" , 12,140);
    }
}
