package Practical6.P6Q1;

public class SavingAcc extends Account {

    private static double interestRate=0.02;
    
    public SavingAcc(){}

    public SavingAcc(int accountNum,double balance, String dateCreated){
        super(accountNum, balance, dateCreated);
    }

    public double calculateInterest(){
        return interestRate*getBalance();
    }

    public void addInterest(){
        deposit(calculateInterest());
    }
    
    @Override
    public String toString(){
        return String.format("%sInterest Rate:%.2f%%\n", super.toString(),interestRate*100);
    }

}
