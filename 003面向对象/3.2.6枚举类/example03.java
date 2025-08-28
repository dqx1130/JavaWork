enum Weekday2{
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);
    public final int dayValue;
    private Weekday2(int dayValue){
        this.dayValue = dayValue;
    }
}

public class example03 {
    public static void main(String[] args){
        Weekday2 day = Weekday2.SUN;
        if (day.dayValue == 6 || day.dayValue == 0){
            System.out.println("Work at home");
        }else{
            System.out.println("Work at office");
        }
    }
}
