class Person{
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    // TODO: 给Person增加重载方法setName(String, String):
    public void setName(String name1 , String name2){
        this.name = name1 + " " + name2;
    }
}
public class practise01 {
    public static void main(String[] args){
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("Xiao Ming");
        hong.setName("xiao","hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}
