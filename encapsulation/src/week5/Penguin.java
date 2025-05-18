package week5;
public class Penguin {
    private String name;
    private int health;
    private int love;
    private String sex;
    public void getName(String name) {
        this.name = name;
    }
    public void getHealth(int health) {
        this.health = health;
    }
    public void getLove(int love) {
        this.love = love;
    }
    public void getSex(String sex) {
        this.sex = sex;
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Love: " + love);
        System.out.println("Sex:" + sex);
    }
}

