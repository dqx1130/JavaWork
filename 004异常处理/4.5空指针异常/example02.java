class Address{
    String City;
    String street;
    String zipcode;
}
class Person{
    String[] name = new String[2];
    Address address = new Address();
}

public class example02 {
    public static void main(String[] args){
        Person p = new Person();
        //NullPointerException是Java代码常见的逻辑错误，应当早暴露，早修复；
        System.out.println(p.address.City.toLowerCase());
    }
}
