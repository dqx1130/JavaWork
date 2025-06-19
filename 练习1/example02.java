//首先定义一个计算二维坐标系中圆面积的类CircleClass，
// 要求该类的成员变量由圆心和圆上一点构成。类中有一个定义圆心座标,圆上一点座标的构造函数，
// 以及一个通过圆上一点座标与圆心座标计算圆面积的方法area。
// 然后，通过上述类生成两个圆对象circle1、circle2进行测试：
// 其中circle1的圆心、圆上一点座标分别为(0,0)、(8.5,9)，
// circle2的圆心和圆上一点座标分别为(2,3.5)、(9,6)，并分别显示各自面积。
// (计算时π的值可以用Math.PI)
class CircleClass{
    private double cent_x;
    private double cent_y;
    private double x;
    private double y;
    public CircleClass(double cent_x,double cent_y ,double x ,double y){
        this.cent_x = cent_x;
        this.cent_y = cent_y;
        this.x = x;
        this.y = y;
    }
    public double getCent_x(){
        return cent_x;
    }
    public double getCent_y(){
        return cent_y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double Area(){
        double r;
        double tmp_x = Math.abs(this.x - this.cent_x);
        double tmp_y = Math.abs(this.y - this.cent_y);
        r = Math.sqrt(tmp_x * tmp_x + tmp_y * tmp_y);
        return r * r * Math.PI;
    }

}
public class example02 {
    public static void main(String[] args){
        CircleClass c1 = new CircleClass(0,0,8.5,9);
        CircleClass c2 = new CircleClass(2,3.5,9,6);
        System.out.printf("%.2f\n",c1.Area());
        System.out.printf("%.2f\n",c2.Area());
    }
}
