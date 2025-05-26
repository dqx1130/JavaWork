
abstract class Person{
    private int id;
    private String name;
    private int bir;

    public Person(int id, String name ,int bir){
        this.id = id;
        this.name = name;
        this.bir = bir;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBir(){
        return bir;
    }
    @Override
    public String toString(){
        return "Person [id=" + id + ", name=" + name + ", bir=" + bir + "]";
    }
}
//Student类继承Person
class Student extends Person{
    private String major;
    private double score;

    public Student(int id ,String name ,int bir, String major,double score){
        super(id ,name , bir );
        this.major = major;
        this.score = score;
    }
    @Override
    public String toString(){
        return "Student [id=" + getId() + ", name=" + getName() + ", bir=" + getBir() + ", major=" + major + ", score=" + score + "]";
    }
}


public class example02 {
}
