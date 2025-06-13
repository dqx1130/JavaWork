class Person{
    public void run1(){
        System.out.println("Person.run1");
    }
    public void  run2(){
        System.out.println("Person.run2");
    }
}
class Student extends Person{
    @Override
    public void run1(){
        System.out.println("Student.run1");
}


public class example01 {
    public static void main(String[] args){

    }
}
}
