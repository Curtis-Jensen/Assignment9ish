package plumb;

public class FaceCard extends PCard{
    String cardNum;
    char cardSuit;

    //Instantiates the card
    FaceCard(String cardNum, char cardSuit){
        this.cardSuit = cardSuit;
        this.cardNum = cardNum;
    }

    //Pulls the card's contents.
    public String getText() {
        return this.cardNum + this.cardSuit;//...by concatenating and returning it's contents
    }

    public String getCardNum(){//Doesn't get called because I didn't know how to make it work.
        return this.cardNum;//Just returns the rank
    }
}
