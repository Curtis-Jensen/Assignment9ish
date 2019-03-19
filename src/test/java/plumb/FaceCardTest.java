package plumb;

import org.junit.jupiter.api.Test;

class FaceCardTest {


    public static void main(String[] args) {//Draw any card
        String[] cardNum = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Kn", "Q", "K"}; //Each rank in the deck
        char[] cardSuit = {'\u2660', '\u2663', '\u2665', '\u2666'}; //Each suit in the deck


        PDeck deck = new CDeck();

        //Instantiating the cards by using each combination.
        for (int i = 0; i < cardSuit.length; i++) {//Goes through one suit at a time.
            for (int j = 0; j < cardNum.length; j++) {//Goes through each rank in the suit.
                deck.addCard(new FaceCard(cardNum[j] , cardSuit[i]));//Makes each new combination a new card to be immediately added.
            }
        }


//        hand.addCard(new FaceCard("A", '\u2660'));//This comment block is a deck test
//        hand.addCard(new FaceCard("A", '\u2660'));
//        hand.addCard(new FaceCard("A", '\u2660'));
//        hand.addCard(new FaceCard("A", '\u2660'));
//        hand.addCard(new FaceCard("2", '\u2660'));
//        hand.addCard(new FaceCard("2", '\u2660'));
//        hand.addCard(new FaceCard("3", '\u2660'));
//
//
//
//        DeckTest.run(deck);
        HandTest.run(deck, new CHand());
    }
}