record Point2(int x, int y) {
    //Compact Constructor
    public Point2{
        if (x < 0 || y < 0){
            throw new IllegalArgumentException();
        }
    }
}
public class example02 {
    public static void main(String[] args){
        Point2 p = new Point2(123,456);
        System.out.println(p.x());
        System.out.println(p.y());
    }
}
