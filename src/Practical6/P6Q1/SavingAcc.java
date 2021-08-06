package Practical6.P6Q1;

public class SavingAcc extends Account {

    private double interestRate;


    public SavingAcc(){}

    public SavingAcc(int accountNum,double balance, String dateCreated,double interestRate){
        this.setAccountNum(accountNum);
        this.setBalance(balance);
        this.setDateCreated(dateCreated);
        this.interestRate=interestRate;
    }

    public double calculateInterest(){
        return interestRate*getBalance();
    }

    public void addInterest(){
        setBalance(getBalance()+calculateInterest());
    }
   
    @Override
    public String toString(){
        return String.format("%sInterest Rate:%.2f%%\n", super.toString(),interestRate*100);
    }

}
