package car;

public class RentalTest {
    public static void main(String[] args) {
        // 直接创建车辆对象
        MotoVehicle gl8 = new Car("京A12345", "别克", "黑色", 5000, "别克商务舱GL8");
        MotoVehicle bmw = new Car("京B54321", "宝马", "白色", 3000, "宝马550i");
        MotoVehicle smallBus = new Bus("京C67890", "金杯", "银色", 8000, 16);
        MotoVehicle largeBus = new Bus("京D09876", "金龙", "蓝色", 10000, 20);

        // 计算并输出租金
        System.out.println("别克商务舱GL8租5天价格: " + gl8.calcRent(5));
        System.out.println("宝马550i租3天价格: " + bmw.calcRent(3));
        System.out.println("16座客车租2天价格: " + smallBus.calcRent(2));
        System.out.println("20座客车租7天价格: " + largeBus.calcRent(7));

        // 显示车辆信息
        displayVehicleInfo(gl8);
        displayVehicleInfo(bmw);
        displayVehicleInfo(smallBus);
        displayVehicleInfo(largeBus);
    }

    private static void displayVehicleInfo(MotoVehicle vehicle) {
        System.out.println("\n车辆信息：");
        System.out.println("车牌号: " + vehicle.getNo());
        System.out.println("品牌: " + vehicle.getBrand());
        System.out.println("颜色: " + vehicle.getColor());
        System.out.println("里程: " + vehicle.getMileage() + "公里");

        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println("车型: " + car.getType());
        } else if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            System.out.println("座位数: " + bus.getSeatCount());
        }
    }
}
