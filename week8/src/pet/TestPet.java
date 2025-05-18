package pet;

public class TestPet {
    public static void main(String[] args) {
        // 创建主人
        Master master = new Master();

        // 创建不同宠物（子类自动向上转型为父类Pet）
        Pet myDog = new Dog("旺财");
        Pet myPenguin = new Penguin("Q仔");

        // 测试单个喂养
        System.out.println("=== 单独喂养测试 ===");
        master.feedPet(myDog);
        master.feedPet(myPenguin);

        // 测试批量喂养
        System.out.println("\n=== 批量喂养测试 ===");
        Pet[] pets = {new Dog("大黄"), new Penguin("胖胖"), new Dog("阿福")};
        master.feedPets(pets);
    }
}