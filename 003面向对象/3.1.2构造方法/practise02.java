class Person3{
    private String name;
    private int age;
    //        TODO
    public Person3(String name ,int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class practise02 {
    public static void main(String[] args){
        Person3 ming = new Person3("小明",12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}

