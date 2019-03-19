package OlderAssignments;

public class DesertShop {
    public double Routine() {
        Checkout checkout = new Checkout();

        checkout.add(new IceCream("Strawberry Ice Cream", 1.45));
        checkout.add(new Sundae("Vanilla Ice Cream", 1.05, "Caramel", 0.50));
        checkout.add (new Candy("Gummy Worms", 1.33, 0.89));
        checkout.add (new Cookie("Chocolate Chip Cookies", 4, 3.99));
        checkout.add (new Candy("Salt Water Taffy", 1.5, 2.09));
        checkout.add (new Candy("Candy Corn", 3.0, 1.09));
        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println(checkout);

        return checkout.totalCost();
    }
}
