package cn.bigdata;

public class Pet
{
    private String name;
    private int health;
    private int love;
    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLove() {
        return love;
    }
    public void setLove(int love) {
        this.love = love;
    }
    public void print() {
        System.out.println("Pet [health=" + health + ", love=" + love + ", name=" + name + "]");
    }
    @Override
    public String toString(){
        return "Pet [health=" + health + ", love=" + love + ", name=" + name + "]";
    }
}
