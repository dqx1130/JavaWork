public interface inter1 {
    public static final double PI = 3.14;
    public abstract void eat();
    public default void print(){
        System.out.println("adfdfa");
    }
    public static int add(int a, int b){
        return a + b;
    }
}
