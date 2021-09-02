import java.util.ArrayList;
public class Player {
    ArrayList<Card> cards;

    public Player(){
        cards = new ArrayList<Card>(52); //setting the size to 52
    }

    public void getCard(Card aCard){ //get card from deck to player pile
        cards.add(aCard);
    }
//pull a card from the zero position of the arraylist of player
    public Card playCard(){ 
        return cards.remove(0);
    }

    public Card seeCard(int position){// shows card at any given position in deck (used for debugging)
        return cards.get(position);
    }

    public int cardCount(){//returns the number of cards that are in each players arraylist
        return cards.size();
    }
}

