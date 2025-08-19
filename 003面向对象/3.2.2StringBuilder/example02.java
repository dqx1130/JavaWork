public class example02 {
    public static void main(String[] args){
        var sb = new StringBuilder(1024);
        sb.append("Mr ")
           .append("Bob")
            .append("!")
             .insert(0,"Hello, ");
        System.out.println(sb);
        System.out.println(sb.toString());
    }
}
