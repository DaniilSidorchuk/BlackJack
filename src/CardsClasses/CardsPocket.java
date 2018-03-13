package CardsClasses;

import Enums.Rang;
import Enums.Suit;

import java.util.ArrayList;
import java.util.Collections;

public class CardsPocket {

   private ArrayList <Card> pocket = new ArrayList<>();
   private int amountOfPoints;

    public void addCard (Card card){
        pocket.add(card);
        amountOfPoints+=card.getPoints();
    }

    public int getAmountOfPoints() {
        return amountOfPoints;
    }

    public double checkChance(){
        int freePoints = 21 - amountOfPoints;
        int acceptableCards = 0;
        Rang [] rangs = new Rang[]{Rang.ACE, Rang.KING,Rang.QEEN,Rang.JACK,Rang.TEN,Rang.NINE,Rang.EIGHT,Rang.SEVEN,Rang.SIX,Rang.FIVE,Rang.FOUR,Rang.THREE, Rang.TWO};
        for (int i = 0; i <rangs.length ; i++) {
            if (freePoints<=rangs[i].value()){
                int card = 4;
                int sameCards = Collections.frequency(pocket,new Card(Suit.Hearts,rangs[i]));
                sameCards+=Collections.frequency(pocket,new Card(Suit.Clubs,rangs[i]));
                sameCards+=Collections.frequency(pocket,new Card(Suit.Spades,rangs[i]));
                sameCards+=Collections.frequency(pocket,new Card(Suit.Diamonds,rangs[i]));
                card-=sameCards;
                acceptableCards+=card;
            }
                    }
        return acceptableCards/52;

    }

}
