package Practical6.P6Q1;

public class Account {
    private int accountNum;
    private double balance;
    private String dateCreated;

    public Account(){}

    public Account(int accountNum,double balance, String dateCreated){
        this.accountNum=accountNum;
        this.balance=balance;
        this.dateCreated=dateCreated;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void deposit(double cash){
        balance+=cash;
    }

    public void withdrawal(double cash){
        balance-=cash;
    }

    public String toString(){
        return String.format("Account Number: %d\nBalance: %.2f\nDate Created: %s\n", accountNum,balance,dateCreated);
    }

}


