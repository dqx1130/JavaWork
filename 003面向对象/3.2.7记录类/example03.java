record Point3(int x,int y){
    public static Point3 of(){
        return new Point3(0,0);
    }
    public static Point3 of(int x , int y){
        return new Point3(x,y);
    }
}

public class example03 {
    public static void main(String[] args){
        var z = Point3.of();
        var p = Point3.of(123,456);
        System.out.println(z);
        System.out.println(p);
    }
}
