package plumb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CDeck implements PDeck {
    List<PCard> deck = new ArrayList();

    /**
     * Randomizes the deck.
     */
    public void shuffle() {
        Random rnd = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int randomNum = rnd.nextInt(i + 1);
            // Simple swap
            PCard rndCard = deck.get(randomNum);
            deck.set(randomNum, deck.get(i));
            deck.set(i, rndCard);
        }
    }

    /**
     * Adds a card to the end of the deck.
     */
    public void addCard(PCard card) {
        deck.add(card);
    }

    /** Removes a card from the end of the deck. */
    public PCard dealCard(){
        PCard dealtCard = deck.get(-0);
        deck.remove(-0);

        return dealtCard;
    };

    /** Removes a card from the end of the deck and marks it as hidden. */
    public PCard dealHiddenCard(){

        return null;
    };

    /**
     * Returns the number of cards in the deck.
     */
    public int cardCount() {
        return deck.size();
    }
}
