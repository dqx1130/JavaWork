package week5;

public class complex {
    private double realPart;
    private double imagPart;
    public complex(double realPart, double imagPart){
        this.realPart = realPart;
        this.imagPart = imagPart;
    }
    public void add(complex other){
        this.realPart = realPart + other.realPart;
        this.imagPart = imagPart + other.imagPart;

    }
    public void sub(complex other){
        this.realPart = realPart - other.realPart;
        this.imagPart = imagPart - other.imagPart;
    }
    public void print(){
        System.out.println(realPart + " + " + imagPart + "i");
    }
    public static void main(String[] args) {
        complex c1 = new complex(2, 3);
        complex c2 = new complex(4, 5);
        c1.add(c2);
        c1.print();
        c1.sub(c2);
        c1.print();
    }

}
