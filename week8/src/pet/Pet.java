package pet;

public abstract class Pet {
    private String name;
    private int health;
    private int hunger; // 饥饿度

    public Pet(String name) {
        this.name = name;
        this.health = 80; // 初始健康值
        this.hunger = 50; // 初始饥饿度
    }

    // 抽象方法 - 每种宠物有不同的吃法
    public abstract void eat();

    // 公共方法
    public void showStatus() {
        System.out.printf("%s的状态: 健康值=%d, 饥饿度=%d\n",
                name, health, hunger);
    }

    // Getter和Setter
    public String getName() { return name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getHunger() { return hunger; }
    public void setHunger(int hunger) { this.hunger = hunger; }
}