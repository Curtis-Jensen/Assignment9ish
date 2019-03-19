package plumb;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Curtis Jensen
 */

public class CHand implements PHand {
    List<PCard> hand = new ArrayList();
    List<PCard> handsAces = new ArrayList();

    /**
     * Returns the number of cards in the hand.
     */
    public int getSize() {
        return hand.size();
    }

    /**
     * Adds a card to the end of the hand.
     *
     * @param card
     */
    public void addCard(PCard card) {
        hand.add(card);
    }

    /**
     * Returns a card from the hand (but not removed).
     *
     * @param index
     */
    public PCard getCard(int index) {
        return hand.get(index);
    }

    /**
     * Removes and returns the card
     *
     * @param index
     */
    public PCard removeCard(int index) {
        return hand.remove(index);
    }

    /**
     * Returns the point value of the current hand.
     */
    public int getValue() {
        int endValue = 0;//If none of the tests pass we'll assume it's a knight
        String cardText;

        for (int i = 0; i < hand.size(); i++) {//looks through the whole hand
            cardText = hand.get(i).getText();

            if(cardText.contains("J")||cardText.contains("Kn")||cardText.contains("Q")||cardText.contains("K")){
                endValue += 10;
                System.out.println("Added 10 for Face");
            }

            else if (!cardText.contains("A")){
                cardText = cardText.substring(0, cardText.length() - 1);//Gets the integer from rank
                endValue += Integer.parseInt(cardText);
                System.out.println("Added " + Integer.parseInt(cardText));
            }
            else{
                handsAces.add(hand.get(i));
                endValue += 1;
                //TODO: Make Ace variable
                System.out.println("Added 1 for Ace");
            }
        }
        for (PCard card:handsAces) {
            if((endValue + 10) <= 21){
                endValue += 10;
                System.out.println("Added 10 more for ace");
            }
        }
        System.out.println(endValue);
        return endValue;
    }
}
