public class example03 {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2){
            System.out.println("s1 == s2");
        }else {
            System.out.println("s1 != s2");
        }
        System.out.println("------------------------------------------------");
        if (s1.equals(s2)){
            System.out.println("s1 equals s2");
        }else {
            System.out.println("s1 not equal s2");
        }
    }
}
