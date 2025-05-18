package cn.bigdata;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("小A", 100, 100, "二哈");
        Dog d2 = new Dog("小B", 100, 100, "泰迪");
        d1.print();
        d2.print();
        System.out.print(d1.toString());
        System.out.print(d2.toString());
    }
}
