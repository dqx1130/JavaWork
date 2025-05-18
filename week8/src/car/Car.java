package car;

public final class Car extends MotoVehicle {
    private String type; // 型号

    public Car(String no, String brand, String color, double mileage, String type) {
        super(no, brand, color, mileage);
        this.type = type;
    }

    @Override
    public double calcRent(int days) {
        // 根据车型确定日租金
        switch (this.type) {
            case "别克商务舱GL8":
                return 600 * days;
            case "宝马550i":
                return 500 * days;
            case "别克林荫大道":
                return 300 * days;
            default:
                return 400 * days; // 默认值
        }
    }

    public String getType() {
        return type;
    }
}
