import CardsClasses.CardsPocket;
import Enums.Mettle;

public class Player {

    private String name;
    private CardsPocket cardsPocket;
    private Mettle mettle;
    private int wins;

    public Player(String name, Mettle mettle) {
        this.name = name;
        this.mettle = mettle;
    }

    public void getStartingCards(){
        this.cardsPocket = new CardsPocket();
    }

    protected boolean stopGame(){
    if (cardsPocket.checkChance()>mettle.chance()){
        return false;
    }
    return true;
    }

    public String getName() {
        return name;
    }

    public int amountOfPoints () {
        return cardsPocket.getAmountOfPoints();
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public CardsPocket getCardsPocket() {
        return cardsPocket;
    }

    public Mettle getMettle() {
        return mettle;
    }
}
