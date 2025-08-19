class Outer1{
    private String name;
    Outer1(String name){
        this.name = name;
    }
    class Inner{
        void hello(){
            System.out.println("Hello," + Outer1.this.name);
        }
    }
}

public class example01 {
    public static void main(String[] args){
        Outer1 outer = new Outer1("Nested");
        Outer1.Inner inner = outer.new Inner();
        inner.hello();
    }
}
