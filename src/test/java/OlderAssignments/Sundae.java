package OlderAssignments;

public class Sundae extends IceCream{
    String topping;

    Sundae(String name, double cost, String topping, double toppingCost) {
        super(name, cost);
        this.name = name;
        this.cost = cost + toppingCost;
    }

    public double calculateItemCost() {
        return this.cost;
    }
}
