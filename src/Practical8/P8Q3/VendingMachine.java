package Practical8.P8Q3;

public class VendingMachine {
    private Dispenser[] dispenser;
    private MoneyCollector moneyCollector;

    public VendingMachine(Dispenser[] dispenser, MoneyCollector moneyCollector){
        this.dispenser=dispenser;
        this.moneyCollector=moneyCollector;
    }

    public String purchaseDrink(int dispenserIndex, int purchaseQuantity,double totalPayment){
        return String.format("Purchase Success!\nYour balance is RM %.2f\n\n",moneyCollector.calculateBalance(calculateGrandTotal(dispenserIndex, purchaseQuantity), totalPayment));
    }

    public double calculateGrandTotal(int dispenserIndex,int purchaseQuantity){
        return dispenser[dispenserIndex].getPrice()*purchaseQuantity;
    }

    public String dispense(int dispenserIndex, int purchaseQuantity){
        return purchaseQuantity+" "+dispenser[dispenserIndex].getProductName()+" is Dispensed.";
    }

    public Dispenser[] getDispenser() {
        return dispenser;
    }

    public MoneyCollector getMoneyCollector() {
        return moneyCollector;
    }


}
