import java.util.ArrayList;
/**
 * Write a description of Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player {
    ArrayList<Card> myCards;

    public Player(){
        myCards = new ArrayList<Card>(52); //setting the size to 52
    }

    public void getCard(Card aCard){ //get card from deck to player pile
        myCards.add(aCard);
    }

    public Card playCard(){ //pull a card from the zero position of the arraylist of player
        return myCards.remove(0);
    }

    public Card seeCard(int position){// shows card at any given position in deck (used for debugging)
        return myCards.get(position);
    }

    public int cardCount(){//returns the number of cards that are in each players arraylist
        return myCards.size();
    }
}
