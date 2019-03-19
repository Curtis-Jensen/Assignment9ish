package OlderAssignments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DesertItemTest {

    @Test
    void calculateItemCostTest(){
        //DesertItem initialTest = new DesertItem();
        //assertEquals(4, initialTest.calculateItemCost(2,2));
    }

    @Test
    void CheckoutTest (){
        DesertShop roof = new DesertShop();
        assertEquals(14.898375,roof.Routine());
    }

    @Test
    void CandyTest(){
        Candy candy = new Candy("Gummy Worms", 1.33, 0.89);
        assertEquals(1.1837, candy.calculateItemCost());
    }

    @Test
    void CookieTest(){
        Cookie cookie = new Cookie("Chocolate Chip Cookies", 4, 3.99);
        assertEquals(1.33, cookie.calculateItemCost());
    }

    @Test
    void IceCreamTest(){
        IceCream iceCream = new IceCream("Strawberry Ice Cream", 1.45);
        assertEquals(1.45, iceCream.calculateItemCost());
    }

    @Test
    void SundaeTest(){
        Sundae sundae = new Sundae("Vanilla Ice Cream", 1.05, "Caramel", 0.50);
        assertEquals(2.150625, sundae.calculateItemCost());
    }

    @Test
    void FindSalesTaxTest(){

    }
}