import java.math.BigInteger;
public class example02 {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("998999999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);
    }
}
