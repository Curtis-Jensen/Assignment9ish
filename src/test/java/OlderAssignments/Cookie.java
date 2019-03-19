package OlderAssignments;

public class Cookie extends DesertItem {
    double cost;

    Cookie(String name, double multiplier,double cost){
        this.name = name;
        this.cost = multiplier/12 * cost;
    }

    public double calculateItemCost() {
        return this.cost;
    }
}
