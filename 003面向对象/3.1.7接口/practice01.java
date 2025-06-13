interface Income{
    double getTax();
}

class SalaryIncome implements Income {
    private double income;
    public SalaryIncome(double income){
        this.income = income;
    }
    @Override
    public double getTax(){
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
class RoyaltyIncome implements Income{
    private double income;
    public RoyaltyIncome(double income){
        this.income = income;
    }
    @Override
    public double getTax(){
        return 0 * income;
    }
}

public class practice01 {
    public static void main(String[] args) {
        // TODO: 用接口给一个有工资收入和稿费收入的小伙伴算税:
        Income[] incomes = new Income[] { new Income()
        {
            private double income = 3000;
            @Override
            public double getTax()
            {
                return 0;
            }
        }, new SalaryIncome(7500), new RoyaltyIncome(12000) };
        double total = 0;
        for ( int i = 0 ; i < incomes.length ; i++){
            total += incomes[i].getTax();
        }
        System.out.println(total);
    }

}