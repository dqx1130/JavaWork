import week5.Dog;
import week5.Penguin;
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.get();
        dog.print();
        Penguin penguin = new Penguin();
        penguin.getName("Penguin");
        penguin.getHealth(100);
        penguin.getLove(100);
        penguin.getSex("雄");
        penguin.print();

    }
}
