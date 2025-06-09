class Person{
    protected String name;
    protected int age;
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
class Student extends Person{
    private int score;
    public int getScore(){
        return this.score;
    }
    public void setScore(int score){
        this.score = score;
    }
    public String hello(){
        return "Hello," + super.name;
    }
}
public class example01 {
    public static void main(String[] args){
        Student s = new Student();
        s.setName("AK");
        System.out.println(s.hello());

    }
}
