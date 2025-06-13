class Person2{
    protected String name;
    protected int age;
    public Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){
        return name + " " + age;
    }
}
class Student2 extends Person2{
    protected int score;
    public Student2(String name ,int age , int score){
        super(name,age);
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    @Override
    public String toString(){
        return super.toString() + " " + score;
    }
}
class PrimaryStudent extends Student2{
    //TODO
    protected int grade;
    public int getGrade(){
        return this.grade;
    }
    public PrimaryStudent(String name , int age , int score , int grade){
        super(name,age,score);
        this.grade = grade;
    }
    @Override
    public String toString(){
        return super.toString() + " " + grade;
    }
}

public class practise01 {
    public static void main(String[] args){
        PrimaryStudent s = new PrimaryStudent("A",15,150,12);
        System.out.println(s);
    }
}
