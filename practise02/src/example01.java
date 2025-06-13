import java.util.Scanner;

class Shape{
    public double getPerimeter(){
        return 0.0;
    }
    public double getArea(){
        return 0.0;
    }
}
class Square extends Shape{
    protected double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
    @Override
    public double getArea(){
        return side * side;
    }
}
class Rectangle extends Shape{
    protected double high;
    protected double width;
    public Rectangle(double high , double width){
        this.width = width;
        this.high = high;
    }
    @Override
    public double getPerimeter(){
        return high* 2 + width * 2;
    }
    @Override
    public double getArea(){
        return high * width;
    }
}
class Circle extends Shape{
    protected double r;
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double getPerimeter(){
        return 2 * r * Math.PI;
    }
    @Override
    public double getArea(){
        return r * r * Math.PI;
    }
}

public class example01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double width = sc.nextDouble();
        double high = sc.nextDouble();
        double r = sc.nextDouble();
        Square s = new Square(side);
        System.out.printf("%.2f %.2f\n",s.getPerimeter(),s.getArea());
        Rectangle R = new Rectangle(high,width);
        System.out.printf("%.2f %.2f\n",R.getPerimeter(),R.getArea());
        Circle C = new Circle(r);
        System.out.printf("%.2f %.2f\n",C.getPerimeter(),C.getArea());
    }
}
