class Book{
    private String name;
    private String author;
    private int sale;
    //无参构造
    public Book(){
        this.name = "unknown";
        this.author = "unknown";
        this.sale = 0;
    }
    //有参构造
    public Book(String name , String author ,int sale){
        this.name = name;
        this.author = author;
        this.sale = sale;
    }
    //设置方法
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setSale(int sale){
        this.sale = sale;
    }
    public void printBook(){
        System.out.println(name + " " + author + " " + sale);
    }
}
public class example01 {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.printBook();

        Book book2 = new Book("A","B",10);
        book2.printBook();

    }
}
