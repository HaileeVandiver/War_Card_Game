import java.util.ArrayList;
public class Deck {
   ArrrayList<Card> myDeck;

   public Deck(String[]ranks, String[] suits, int[] values) {
       myDeck = new ArrayList<Card>(52); 
       ranks = 
       suits =
       values =
      
       for (int i=0; i < suits.length; i++){
           for( int x = 0; ranks.length; x++){
               deck.add(new Card(suits[i], ranks[x]));
               /* Check to make sure ranks and values are the same length */
      /* Iterate over each suit */
      //   Iterate an index from 0 to length of ranks */
      //     Make a card and add it to a collection
     

   public void shuffle() {
      Collections.shuffle(this.cards);
    }

   public Card deal() {
        if (size == 0) 
        return null;
        else{ 
            size--;
            return cards.get(size);
        }
    }
        
    @Override 
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";
        
        for(int k = size - 1; k>= 0; k--)

    }
   }
}
}
}
