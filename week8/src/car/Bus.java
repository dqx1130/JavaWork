package car;

public final class Bus extends MotoVehicle {
    private int seatCount; // 座位数

    public Bus(String no, String brand, String color, double mileage, int seatCount) {
        super(no, brand, color, mileage);
        this.seatCount = seatCount;
    }

    @Override
    public double calcRent(int days) {
        // 根据座位数确定日租金
        if (this.seatCount <= 16) {
            return 800 * days;
        } else {
            return 1500 * days;
        }
    }

    public int getSeatCount() {
        return seatCount;
    }
}