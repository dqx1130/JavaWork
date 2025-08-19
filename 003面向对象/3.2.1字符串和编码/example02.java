public class example02 {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO".toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println();
    }
}
