// 示例05：演示Java中包装类的常用方法和属性
public class example05 {
    public static void main(String[] args){
        // 输出整数100的字符串表示
        System.out.println(Integer.toString(100));            // 十进制字符串
        System.out.println(Integer.toString(100,36));         // 36进制字符串
        System.out.println(Integer.toHexString(100));         // 十六进制字符串
        System.out.println(Integer.toOctalString(100));       // 八进制字符串
        System.out.println(Integer.toBinaryString(100));      // 二进制字符串

        // Boolean包装类常量
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        // Integer包装类的最大值和最小值
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        // Long包装类的位数和字节数
        int sizeOfLong = Long.SIZE;
        int bytesOfLong = Long.BYTES;
        System.out.println(t);           // 输出true
        System.out.println(f);           // 输出false
        System.out.println(max);         // 输出int的最大值
        System.out.println(min);         // 输出int的最小值
        System.out.println(sizeOfLong);  // 输出long类型的位数
        System.out.println(bytesOfLong); // 输出long类型的字节数

        // Number类的类型转换
        Number num = new Integer(999);
        byte b = num.byteValue();        // 转为byte类型
        int n = num.intValue();          // 转为int类型
        long ln = num.longValue();       // 转为long类型
        float fl = num.floatValue();     // 转为float类型
        double d = num.doubleValue();    // 转为double类型
        System.out.println(b);           // 输出byte值
        System.out.println(n);           // 输出int值
        System.out.println(ln);          // 输出long值
        System.out.println(fl);          // 输出float值
        System.out.println(d);           // 输出double值

        // byte类型的无符号转换
        byte x = -1;
        byte y = 127;
        System.out.println(Byte.toUnsignedInt(x));   // 输出255，-1的无符号int值
        System.out.println(Byte.toUnsignedInt(y));   // 输出127，127的无符号int值
    }
}