package OlderAssignments;

public class Candy extends DesertItem{
    double cost;

    Candy(String name, double multiplier,double cost){
        this.name = name;
        this.cost = multiplier * cost;
        //this.cost *= 1 + this.FindSalesTax();
    }

    public double calculateItemCost() {
        return this.cost;
    }
}
