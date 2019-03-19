package OlderAssignments;

public class IceCream extends DesertItem {
    double cost;

    IceCream(String name, double cost){
        this.name = name;
        this.cost = cost;
      //  this.cost *= 1 + this.FindSalesTax();
    }

    public double calculateItemCost() {
        return this.cost;
    }
}
