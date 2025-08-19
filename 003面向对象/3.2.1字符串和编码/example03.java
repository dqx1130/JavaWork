public class example03 {
    public static void main(String[] args){
        String s1 = "hello";
        System.out.println(s1.contains("ll"));
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.endsWith("lo"));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));
    }
}
