public class Main {
    private static void hello(){
        System.out.println("private hello!");
    }

    static class Inner{
        public void hi(){
            Main.hello();
        }
    }

    public static void main(String[] args){
        Inner i = new Inner();
        i.hi();
    }
}
