import javax.swing.plaf.synth.SynthUI;

public class example04 {
    public static void main(String[] args){
        String res1 = "   \tHello\r\n".trim();
        System.out.println(res1);
        String res2 = "\u3000Hello\u3000".strip();
        System.out.println(res2);
        String res3 = " Hello ";
        System.out.println("a"+res3.stripLeading()+"b");
        System.out.println("a"+res3.stripTrailing()+"b");
    }
}
