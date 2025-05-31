class Person {
    public String name;
    public int age;
}
class Book{
    public String name;
    public String author;
    public String isbn;
    public double price;
}

public class example01 {
    public static void main(String[] args){
        Person ming = new Person();
        ming.name = "Xiaoming";
        ming.age = 16;
        System.out.println(ming.name + ming.age);
        Book book1 = new Book();
        book1.author = "Nine";
        book1.name = "《nide》";
        book1.isbn = "ISO-1231234";
        book1.price = 123.0;
        System.out.println(book1.author);
        System.out.println(book1.name);
        System.out.println(book1.isbn);
        System.out.println(book1.price);
    }
}
