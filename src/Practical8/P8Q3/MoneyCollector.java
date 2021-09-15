package Practical8.P8Q3;

public class MoneyCollector {
    private double moneyCollected;

    public MoneyCollector(double money){
        this.moneyCollected=money;
    }

    public double getMoney() {
        return moneyCollected;
    }

    public void setMoney(double money) {
        this.moneyCollected = money;
    }

    public double calculateBalance(double totalPrice, double amountPaid){
        moneyCollected+=amountPaid;
        moneyCollected-=(amountPaid-totalPrice);
        return amountPaid-totalPrice;
    }



}
