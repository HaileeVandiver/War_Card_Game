java.util.ArrayList;
/**
 * Write a description of Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck {
    private ArrrayList<Card> deck;

   public Deck() {
       deck = new ArrayList<Card>(); 
      
       for (int i=0; i < suits.length; i++){
           for( int x = 0; ranks.length; x++){
               deck.add(new Card(suits[i], ranks[x]));

    }
   }
}

   void shuffle() {
      /* See java.util.Collections.shuffle() */
   }

   Card deal() {
        if (size == 0) 
        return null;
        else{ 
            size--;
            return cards.get(size);
        
   }

}
    @Override 
    public String toString() {
        String cardListOutput="";
        int i=0;
        for(Card aCard : this.deck){
            cardlistOutput+="\n" +i + " " + aCard.toString(); 
            i++;
        }
       return cardListOutput;
       

    }
   }
 
