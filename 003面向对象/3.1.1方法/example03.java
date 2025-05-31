class Person2{
    private String name;
    private int birth;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge(){
        return calcAge(2019);
    }
    private int calcAge(int currentYear){
        return currentYear - this.birth;
    }
}
public class example03 {
    public static void main(String[] args){
        Person2 ming = new Person2();
        ming.setBirth(2002);
        System.out.println(ming.getAge());
    }
}
