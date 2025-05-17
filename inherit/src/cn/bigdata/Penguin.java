package cn.bigdata;

public final class Penguin extends Pet {
    private String breed;

    public Penguin(String name, int health, int love, String breed) {
        super(name, health, love);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void print() {
        super.print();
        System.out.println("Penguin [breed=" + breed + "]");
    }

    @Override
    public String toString() {
        return super.toString() + "Penguin [breed=" + breed + "]";
    }
}