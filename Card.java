public class Card {

    //String that holds suit of card
    private String suit;

    //String that holds rank of card(10,Jack, Queen, etc.)
    private String rank;

    //Integer that holds the point value (10,11,12,etc.)
    private int pointValue;

    public Card(String rank, String suit, int pointValue){
        // initialize rank of card
        this.rank = rank;
        //initialize suit of card
        this.suit = suit;
        //initialize the value of card
        this.pointValue = pointValue;
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
        return suit + " of " + rank;
    }
}  
    

