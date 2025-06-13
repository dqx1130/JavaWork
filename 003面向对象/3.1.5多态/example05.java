class Person3{
    protected String name;
    public Person3(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String hello(){
        return "Hello, " + name;
    }
}

class Student3 extends Person3{
    public Student3(String name){
        super(name);
    }

    @Override
    public String hello(){
        return super.hello() + " !";
    }
}
public class example05 {
    public static void main(String[] args) {
        Student3 s = new Student3("xiaoming");
        System.out.println(s.hello());
    }
}
