class Outer3{
    private static String NAME = "OUTER";
    private String name;
    Outer3 (String name){
        this.name = name;
    }
    static class StaticNested{
        void hello(){
            System.out.println("Hello, " + Outer3.NAME);
        }
    }
}

public class example04 {
    public static void main(String[] args){
        Outer3.StaticNested sn = new Outer3.StaticNested();
        sn.hello();
    }


}
