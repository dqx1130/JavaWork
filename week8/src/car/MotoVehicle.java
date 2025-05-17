package car;
public abstract class MotoVehicle {
    // 属性
    private String no;      // 车牌号
    private String brand;   // 品牌
    private String color;   // 颜色
    private double mileage; // 里程

    // 构造方法
    public MotoVehicle(String no, String brand, String color, double mileage) {
        this.no = no;
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
    }

    // 抽象方法 - 计算租金
    public abstract double calcRent(int days);

    // getter方法
    public String getNo() {
        return no;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getMileage() {
        return mileage;
    }

    // 可以添加setter方法如果需要
}