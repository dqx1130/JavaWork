abstract class Income {
    protected double income;
    public double getIncome(){
        return this.income;
    }
    public void setIncome(double income){
        this.income = income;
    }
    public Income(double income){
        this.income = income;
    }
    public abstract double getTex();

}

class SalaryIncome extends Income{
    public SalaryIncome(double income){
        super(income);
    }
    @Override
    public double getTex(){
        if (this.income > 5000) {
            return (this.income - 5000) * 0.10;
        } else {
            return 0;
        }
    }
}
/**
 * 稿费收入税率是20%
 */
class RoyaltyIncome extends Income {
    public RoyaltyIncome(double income){
        super(income);
    }
    @Override
    public double getTex(){
        return income * 0.2;
    }
}

public class practise01 {
    public static void main(String[] args) {
        Income[] incomes = new Income[] {
                new Income(3000) { // 匿名内部类，用于实现 getTex() 方法
                    @Override
                    public double getTex() {
                        // 演示目的，假设普通收入低于 4000 不征税。
                        // 如果超过，则按 5% 征税。
                        if (this.income > 4000) {
                            return this.income * 0.05;
                        } else {
                        return 0;
                        }
                    }
                },
                new SalaryIncome(7500),
                new RoyaltyIncome(12000)
        };
        double total = 0;
        for (int i = 0 ; i < incomes.length; i ++){
            total += incomes[i].getTex();
        }
        System.out.println(total);
    }

}
