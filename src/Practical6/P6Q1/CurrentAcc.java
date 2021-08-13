package Practical6.P6Q1;

public class CurrentAcc extends Account {
    final int FREE_TRANSACTION_LIMIT = 1;
    private int numOfTransaction = 0;
    private static double transactionFee = 0.2;

    public CurrentAcc(int accountNum, double balance, String dateCreated) {
        super(accountNum, balance, dateCreated);
    }

    @Override
    public void deposit(double cash) {

        if (numOfTransaction >= FREE_TRANSACTION_LIMIT) {
            super.withdrawal(transactionFee);
        }
        super.deposit(cash);

        numOfTransaction++;
    }

    @Override
    public void withdrawal(double cash) {
        if ((cash+transactionFee) > getBalance()) {
            System.out.println("Invalid Input.");
        } else {
            if (numOfTransaction >= FREE_TRANSACTION_LIMIT) {
               super.withdrawal(transactionFee);
            }
            super.withdrawal(cash);
        }
        numOfTransaction++;
    }

    @Override
    public String toString() {
        return String.format("%sNum Of Transaction:%d\nTransaction Fee: RM%.2f per Transaction\n", super.toString(),
                numOfTransaction, transactionFee);
    }

}
