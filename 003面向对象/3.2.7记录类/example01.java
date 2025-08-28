record Point1(int x, int y) {
}

public class example01 {
    public static void main(String[] args){
        Point1 p = new Point1(123,456);
        System.out.println(p.x());
        System.out.println(p.y());
    }
}

