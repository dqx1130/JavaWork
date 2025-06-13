class Income1 {
    protected double income;
    public Income1(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class SalaryIncome1 extends Income1 {
    public SalaryIncome1(double income) {
        super(income);
    }
    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
/**
 * 稿费收入税率是20%
 */
class RoyaltyIncome extends Income1{
    public RoyaltyIncome(double income){
        super(income);
    }
    @Override
    public double getTax(){
        return income * 0.2;
    }

}

public class practise01 {
    public static void main(String[] args) {
        // TODO: 给一个有工资收入和稿费收入的小伙伴算税:
        Income1[] incomes1 = new Income1[] { new Income1(3000), new SalaryIncome1(7500), new RoyaltyIncome(12000) };
        double total = 0;
        for ( int i = 0 ; i < incomes1.length ; i ++  ){
            total += incomes1[i].getTax();
        }
        System.out.println(total);
    }
}
