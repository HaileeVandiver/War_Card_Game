
/**
 * Write a description of WarGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WarGame {
   
    Player p1, p2;// each player
    Card p1Card, p2Card;//the cards being played
    Deck theDeck;// deck object 
    ArrayList<Card> p1Pile, p2Pile;// each player's hand. list to hold cards
    boolean justWarred; // to see if "war" has already happened

    public WarGame(){//constructor
        justWarred = false;
        p1Pile = new ArrayList<Card>();
        p2Pile = new ArrayList<Card>();
        p1 = new Player();
        p2 = new Player();
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String [] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
            "Jack", "Queen", "King"};
        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        theDeck = new Deck(ranks,suits,values);
        theDeck.shuffle();
        for (int i=0; i<26; i++) {// distribute 26 cards to each players hand
            p1.getCard(theDeck.deal());//tell p1 to get a card from the deck
            p2.getCard(theDeck.deal());// tell p2 to get a card from the deck
        }
        beginGame();
    }
   
    private void beginGame(){
        String winner = "";// string to hold who won each round
        while(true){//enter game loop
            showCards();//method for printing
            if(!justWarred) {// no cards on the "table", each players puts down a card
                if (p1.cardCount() > 0)//if the player has more than 0 cards
                    p1Pile.add(p1.playCard());
                else {
                    winner = "p2";//player 1 has 0 cards
                    break;//just here to look pretty
                }
                if (p2.cardCount() > 0)
                    p2Pile.add(p2.playCard());
                else {
                    winner = "p1"; // player 2 has 0 cards
                    break;
                }
            }
            justWarred=false;
            p1Card = p1Pile.get(p1Pile.size()-1);//get card from top of pile
            p2Card = p2Pile.get(p2Pile.size()-1);

            // comparisons to determine who has the bigger card
            if (p1Card.compareTo(p2Card)>0)
                winner = "p1";
            else if (p1Card.compareTo(p2Card)<0)
                winner = "p2";
            else
                winner = "none";

            if (winner.equals("p1")) {//put all cards into p1 pile
                while (p1Pile.size() > 0)//make sure p1 pile has at least 1 card
                    p1.getCard(p1Pile.remove(0));
                while (p2Pile.size() > 0)
                    p1.getCard(p2Pile.remove(0));
            }
            if (winner.equals("p2")) {//put all cards into p2 pile
                while (p2Pile.size() > 0)//make sure p1 pile has at least 1 card
                    p2.getCard(p1Pile.remove(0));
                while (p2Pile.size() > 0)
                    p2.getCard(p1Pile.remove(0));
            }

            if(winner.equals("none")) {
                justWarred = true;
                int count = 0;

                while (p1.cardCount() > 0 && count < 4) {
                    p1Pile.add(p1.playCard());
                    count++;
                }
                count = 0;
                while (p2.cardCount() > 0 && count < 4) {
                    p2Pile.add(p2.playCard());
                    count++;
                }
            }

        }
        System.out.println("The Winner is " +winner+ ".");

        }
}
