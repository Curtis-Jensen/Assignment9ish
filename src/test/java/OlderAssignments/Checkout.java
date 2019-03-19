package OlderAssignments;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
List<DesertItem> shoppingList = new ArrayList();

    public void add(DesertItem newItem){
        shoppingList.add(newItem);
    }

    public int numberOfItems(){
        return shoppingList.size();
    }

    public double totalTax(){
        double totalCost = 0;
        for(DesertItem desertItem: shoppingList){//Gets the cost of each desert item
            totalCost += desertItem.FindSalesTax();
        }
        return totalCost;
    }

    public double totalCost(){
        double totalCost = 0;
        for(DesertItem desertItem: shoppingList){//Gets the cost of each desert item
            totalCost += desertItem.calculateItemCost();
            totalCost += desertItem.FindSalesTax();
        }
        return totalCost;
    }
}
