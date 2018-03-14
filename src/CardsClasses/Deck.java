package CardsClasses;

import Enums.Rang;
import Enums.Suit;

import java.util.ArrayList;

public class Deck {

    ArrayList <Card> deck = new ArrayList<>(52);


    public Deck() {

        for (int i = 0; i < 52; i++) {
            Card card = randomCard();
            if (!deck.contains(card)){
                deck.add(card);
            } else {i--;}
        }

    }


    public Card randomCard(){

        Suit [] suit = new Suit[]{Suit.Clubs,Suit.Diamonds,Suit.Hearts,Suit.Spades};
        Rang [] rangs = new Rang[]{Rang.ACE, Rang.KING,Rang.QEEN,Rang.JACK,Rang.TEN,Rang.NINE,Rang.EIGHT,Rang.SEVEN,Rang.SIX,Rang.FIVE,Rang.FOUR,Rang.THREE,Rang.TWO};

        int suitRandomIndex = (int) Math.random()*3;
        int rangsRandomIndex = (int) Math.random()*12;

        return new Card(suit[suitRandomIndex],rangs[rangsRandomIndex]);

    }

    public void reduceDeck(Card card){
        deck.remove(card);
    }

    public void shuffleTheDeck(){
        int randomNumber = (int) Math.random()*25+10;

        for (int i = 0; i < randomNumber; i++) {
            int index1 = (int) Math.random()*deck.size();
            int index2 = (int) Math.random()*deck.size();
           Card card = deck.get(index1);
           deck.set(index1, deck.get(index2));
           deck.set(index2,card);
        }
    }


}
