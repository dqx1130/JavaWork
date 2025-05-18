// main.java
package Print;
public class main {
    public static void main(String[] args) {
        Printer colorPrinter = new ColorPrinter();
        colorPrinter.print("Hello, World!");

        Printer blackPrinter = new BlackPrinter();
        blackPrinter.print("Hello, World!");
    }
}