
class BankAccount{
    private String name;
    private String no;
    private double money;
    //三个参数
    public BankAccount(String name , String no , double money){
        this.name = name;
        this.no = no;
        this.money = money;
    }
    //一个参数
    public BankAccount(String no){
        this.name = "默认";
        this.no = no;
        this.money = 0.0;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNo(String no){
        this.no = no;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public void check(){
        System.out.println(name + " " + no + " " + money);
    }
    public void deposit(double i){
        System.out.println("存入"+ " " +i);
        System.out.println("余额"+ " "+(money+i));
    }
    public void withdraw(double i){
        if (money - i < 0) {
            System.out.println("余额不足");
        }else{
            System.out.println("已取出"+ " "+i);
            System.out.println("余额" + " "+ (money-i));
        }
    }
}

public class example02 {
    public static void main(String[] args){
        BankAccount a = new BankAccount("0000001");
        a.check();
        a.deposit(100);
        BankAccount b = new BankAccount("Stu2","0000002",1000.0);
        b.check();
        b.withdraw(500);
    }
}
