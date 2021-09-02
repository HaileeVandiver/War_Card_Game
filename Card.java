
public class Card {
   
    private String suit; //String that holds suit of card
    
    private String rank; //String that holds rank of card(10,Jack, Queen, etc.)
    
    private int pointValue; //Integer that holds the point value (10,11,12,etc.)
    
    public Card(String rank, String suit, int pointValue){
        this.rank = rank;// initialize rank of card
        this.suit = suit; //initialize suit of card
        this.pointValue = pointValue; //initialize the value of card
    }
    public String getSuit(){
        return suit;
    }
    public String getRank() {
        return rank;
    }
    public int getPointValue(){
        return pointValue; 
    }
   
    @Override 
    public String toString(){
        return suit  + rank  + pointValue; 
    }
}
   
    

