package week5;
import java.util.Scanner;
public class Dog{
    private String name;
    private int health;
    private int love;
    private String strain;
    public void get(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter health: ");
        health = scanner.nextInt();
        System.out.print("Enter love: ");
        love = scanner.nextInt();
        System.out.print("Enter strain: ");
        strain = scanner.nextLine();
    }
    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Love: " + love);
        System.out.println("Strain: " + strain);
    }
}

