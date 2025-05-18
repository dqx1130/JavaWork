package cn.bigdata;

public class TestPenguin {
    public static void main(String[] args) {
        Penguin p1 = new Penguin("Pingu", 90, 80, "Emperor");
        Penguin p2 = new Penguin("Skipper", 85, 75, "Adelie");
        p1.print();
        p2.print();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}