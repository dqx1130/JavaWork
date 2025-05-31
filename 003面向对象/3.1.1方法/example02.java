//private field
class Person1{
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        if(age < 0 || age > 100){
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}

public class example02 {
    public static void main(String[] args){
        Person1 ming = new Person1();
        ming.setName("Xiao Ming");
        ming.setAge(15);
        System.out.println(ming.getName() + " " + ming.getAge());
    }
}
