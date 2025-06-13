class Person{
    public String name;
    public int age;
    public static int number;
    public Person(String name,int age){
        this.age = age;
        this.name =name;
    }

}

public class example01 {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
    }

}
