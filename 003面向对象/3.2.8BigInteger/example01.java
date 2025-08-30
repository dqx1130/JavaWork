import java.math.BigInteger;

public class example01 {
    public static void main(String[] args){
        BigInteger bi = new BigInteger("123456789000");
        System.out.println(bi);
        //对BigInteger做运算的时候，只能使用实例方法
        BigInteger i2 = new BigInteger("12345678901234567890");
        BigInteger res = bi.add(i2);
        System.out.println(res);
        //把BigInteger转换成long型
        BigInteger i =new BigInteger("12345678900000");
        System.out.println(i.longValue());
        System.out.println(i.multiply(i).longValueExact());
    }
}
