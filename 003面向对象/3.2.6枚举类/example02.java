
enum Weekday1{
    SUN, MON, TUE, WED, THU, FRI, SAT;
}
public class example02 {
    public static void main(String[] args){
        Weekday1 day = Weekday1.SUN;
        if (day == Weekday1.SAT || day == Weekday1.SUN){
            System.out.println("Work at home!");
        }else{
            System.out.println("Work at office!");
        }
        String s = Weekday1.SUN.name();
        int n = Weekday1.MON.ordinal();
        System.out.println(s);
        System.out.println(n);
    }
}
