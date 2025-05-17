package pet;

public class Penguin extends Pet {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "正在吃鱼...");
        setHealth(getHealth() + 3);  // 吃鱼健康+3
        setHunger(getHunger() - 25);  // 饥饿度-25

        // 企鹅特有的行为
        System.out.println(getName() + "吃完后快乐地滑行~");
    }
}