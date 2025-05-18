package cn.bigdata;
public class Dog extends Pet
{
    private String strain;

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }
    public String getStrain() {
        return strain;
    }
    public void setStrain(String strain) {
        this.strain = strain;
    }
    public void print(){
        super.print();
        System.out.println("Dog [strain=" + strain + "]");
    }
    @Override
    public String toString(){
        return super.toString() + "Dog [strain=" + strain + "]";
    }
}
