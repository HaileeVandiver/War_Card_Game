
/**
 * Write a description of Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card {
   
    private String suit; //String that holds suit of card
    
    private String rank; //String that holds rank of card(10,Jack, Queen, etc.)
    
    private int pointValue; //Integer that holds the point value (10,11,12,etc.)
    
    public Card(String cardRank, String cardSuit, int cardPointValue){
        rank = cardRank;// initialize rank of card
        suit = cardSuit; //initialize suit of card
        pointValue = cardPointValue; //initialize the value of card
    }
    public String suit(){
        return suit;
    }
    public String rank() {
        return rank;
    }
    public int pointValue(){
        return pointValue; 
    }
    public boolean matches(Card otherCard){
        return (this.suit.equals(otherCard.suit()) 
            && this.rank.equals(otherCard.rank())
            && this.pointValue==otherCard.pointValue());
    }
    @Override 
    public String toString(){
        return suit  + rank  + pointValue; 
    }
}
    

