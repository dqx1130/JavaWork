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
    private double side;
    public Square(double side){
        this.side = side;
    }
    public double getSide(double side){
        return this.side;
    }
    @Override
    public double getPerimeter(){
        return this.side * 4;
    }
    public double getArea(){
        return this.side * this.side;
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length , double width){
        this.width = width;
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    @Override
    public double getPerimeter(){
        return (this.length + this.width) * 2;
    }
    public double getArea(){
        return this.length * this.width;
    }
}
class Circle extends Shape{
    private double r;
    public Circle(double r){
        this.r = r;
    }
    public double getR(){
        return this.r;
    }
    @Override
    public double getPerimeter(){
        return this.r * 2 * Math.PI;
    }
    public double getArea(){
        return this.r * this.r * Math.PI;
    }
}
public class example01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double r = sc.nextDouble();
        Square Squ = new Square(side);
        Rectangle Rec = new Rectangle(length , width);
        Circle Cir = new Circle(r);
        System.out.printf("%.2f %.2f\n",Squ.getPerimeter(),Squ.getArea());
        System.out.printf("%.2f %.2f\n",Rec.getPerimeter(),Rec.getArea());
        System.out.printf("%.2f %.2f\n",Cir.getPerimeter(),Cir.getArea());
    }
}

// 1
// 1 2
// 2
