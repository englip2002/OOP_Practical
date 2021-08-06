package Practical6.P6Q1;

public class CurrentAcc extends Account {

    private int numOfTransaction=0;
    private static double transactionFee=0.2;
    
    public CurrentAcc(int accountNum,double balance, String dateCreated){
        this.setAccountNum(accountNum);
        this.setBalance(balance);
        this.setDateCreated(dateCreated);
    }

    @Override
    public void deposit(double cash){
        
        if(numOfTransaction>10){
            setBalance(getBalance()+cash-transactionFee);
        }
        else{
            setBalance(getBalance()+cash);
        }
        numOfTransaction++;
    }

    @Override
    public void withdrawal(double cash){
        if(numOfTransaction>10){
            setBalance(getBalance()-cash-transactionFee);
        }
        else{
            setBalance(getBalance()-cash);
        }
        numOfTransaction++;
    }

    @Override
    public String toString(){
        return String.format("%sNum Of Transaction:%d\nTransaction Fee: RM%.2f per Transaction\n", super.toString(),numOfTransaction,transactionFee);
    }


}
