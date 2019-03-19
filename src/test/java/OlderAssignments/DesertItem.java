package OlderAssignments;

public abstract class DesertItem {
    String name;


    public abstract double calculateItemCost();

    public double FindSalesTax(){
        double salesTax = .25;
        double itemCost = calculateItemCost();
        return itemCost * salesTax;
    }
}