import java.util.StringJoiner;
public class example01 {
    public static void main(String[] args){
        String[] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(", ","Hello,","!");
        for (String name : names){
            sj.add(name);
        }
        System.out.println(sj.toString());
        String[] name2 = {"Bob", "Alice", "Grace"};
        var s = String.join(",",name2);
        System.out.println(s);
    }
}
