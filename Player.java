import java.util.ArrayList;

public class Player {
    ArrayList<Card> cards;

    /**
    *setting the size to 52
    */
    public Player(){
        cards = new ArrayList<Card>(52);
    }

    /**
    *get card from deck to player pile
    */
    public void getCard(Card aCard){
        cards.add(aCard);
    }
    /**
    *pull a card from the zero position of the arraylist of player
    */
    public Card playCard(){
        return cards.remove(0);
    }

    /**
    *shows card at any given position in deck (used for debugging)
    */
    public Card seeCard(int position){
        return cards.get(position);
    }

    /**
    *returns the number of cards that are in each players arraylist
    */
    public int cardCount(){
        return cards.size();
    }
}


