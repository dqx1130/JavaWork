import java.sql.Statement;

class Income{
    protected double income;
    public Income(double income){
        this.income = income;
    }
    public double getIncome(){
        return this.income;
    }
    public void setIncome(double income){
        this.income = income;
    }
    public double getTax(){
        return income * 0.1;
    }
}

class Salary extends Income{
    public Salary(double income){
        super(income);
    }
    @Override
    public double getTax(){
        if(income < 5000){
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }
    @Override
    public double getTax(){
        return 0;
    }
}
public class example03 {
    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
    public static void main(String[] args){
        // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
        Income[] incomes = new Income[]{
                new Income(3000),
                new Salary(7000),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }
}
