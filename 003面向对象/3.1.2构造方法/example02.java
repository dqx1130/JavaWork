class Person2{
    private String name;
    private int age;

    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person2(String name){
        this.name = name;
        this.age = 11;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}


public class example02{
    public static void main(String[] args){
        Person2 p = new Person2("Xiao Ming", 15);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        Person2 s = new Person2("xiao hong");
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
