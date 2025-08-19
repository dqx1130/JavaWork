class Outer2{
    private String name;
    Outer2(String name){
        this.name = name;
    }
    void asyncHello(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, "+Outer2.this.name);
            }
        };
        new Thread(r).start();
    }
}


public class example02 {
    public static void main(String[] args){
        Outer2 outer = new Outer2("Nested");
        outer.asyncHello();
    }
}
