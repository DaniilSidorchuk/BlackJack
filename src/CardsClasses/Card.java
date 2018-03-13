package CardsClasses;

import Enums.Rang;
import Enums.Suit;

public class Card {

    private String suit;
    private String rang;
    private int points;

    public Card(Suit suit, Rang rang) {
        this.suit = suit.toString();
        this.rang = rang.toString();
        this.points = rang.value();
    }

    public String getSuit() {
        return suit;
    }

    public String getRang() {
        return rang;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){return false;}
        if (!(obj instanceof Card)){return false;}
        Card card = (Card) obj;

        if (this.getSuit().equals(card.getSuit()) && this.getRang().equals(card.getRang())){
            return true;
        }
        return false;
    }
}



