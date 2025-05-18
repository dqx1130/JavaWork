package pet;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "正在啃骨头...");
        setHealth(getHealth() + 5);  // 吃骨头健康+5
        setHunger(getHunger() - 30); // 饥饿度-30
    }
}