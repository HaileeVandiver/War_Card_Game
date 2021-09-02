import java.util.ArrayList;
import java.util.Collections; 
public class Deck {
     private final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
     private final String [] RANKS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
            "Jack", "Queen", "King"};
     private final int[] VALUES = {1,2,3,4,5,6,7,8,9,10,11,12,13};
     
   ArrayList<Card> cards;

   public Deck(){
       cards = new ArrayList<Card>(52);  
      /* Check to make sure ranks and values are the same length */
         
      /* Iterate over each suit */
      //   Iterate an index from 0 to length of ranks */
      //     Make a card and add it to a collection
       for (int i=0; i < SUITS.length; i++){
           for( int j = 0; j < RANKS.length; j++){
               cards.add(new Card(SUITS[i], RANKS[j], VALUES[j]));// iterating through suits and ranks to populate the deck 
               //deck, using j for both ranks and values to ensure that cards have points even when face card
            }
        }
    }
              
   public void shuffle() {
      Collections.shuffle(this.cards);
    }

   public Card deal() {
       if (cards.size()==0) {
           return null;
        }
        Card removedCard = cards.remove(cards.size()-1);
        return removedCard; // return the "dealt" card 

    }
   }
