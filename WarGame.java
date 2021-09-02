import java.util.ArrayList;

public class WarGame {


    public static void main(String[] args) {
        //each player
        Player p1, p2;

        //the cards being played
        Card p1Card, p2Card;

        // deck object
        Deck theDeck;

        // each player's hand. list to hold cards
        ArrayList<Card> p1Pile, p2Pile;


        // to see if "war" has already happened
        boolean justWarred;

        justWarred = false;
        p1Pile = new ArrayList<>();
        p2Pile = new ArrayList<>();
        p1 = new Player();
        p2 = new Player();
        theDeck = new Deck();

        theDeck.shuffle();

        // distribute 26 cards to each players pile
        for (int i = 0; i < 26; i++) {
            //tell p1 to get a card from the deck
            p1.getCard(theDeck.deal());
            // tell p2 to get a card from the deck
            p2.getCard(theDeck.deal());
        }


        // string to hold who won each round
        String winner = "";

        //enter game loop
        while (true) {
                for (int i=0; i< p1.cardCount(); i++)
                    System.out.print("[]");
                System.out.println();
                for (int i=0; i <p2.cardCount(); i++)
                    System.out.print("[]");
                System.out.println();
                System.out.println("Player 1 stack="+p1.cardCount()+" "+"Player 2 stack="+p2.cardCount());

            // no cards on the "table", each players puts down a card
            if (!justWarred) {
                //if the player has more than 0 cards
                if (p1.cardCount() > 0)
                    p1Pile.add(p1.playCard());
                else {
                    //player 1 has 0 cards
                    winner = "p2";
                    break;

                }
                if (p2.cardCount() > 0)
                    p2Pile.add(p2.playCard());

                else {
                    // player 2 has 0 cards
                    winner = "p1";
                    break;
                }
            }
            justWarred = false;
            //get card from top of pile
            p1Card = p1Pile.get(p1Pile.size() - 1);
            p2Card = p2Pile.get(p2Pile.size() - 1);
            if(p1Card!=null) System.out.println("Player 1 card="+p1Card.toString());
            if(p2Card!=null) System.out.println("Player 2 card="+p2Card.toString());
            for(int i=0; i<p1.cardCount();i++)
                System.out.print(p1.seeCard(i).getPointValue()+" ");
            System.out.println();
            for(int i=0; i<p2.cardCount();i++)
                System.out.print(p2.seeCard(i).getPointValue()+" ");
            System.out.println();
            if(justWarred){
                System.out.print("Just Warred! p1 pile: "+p1Pile.size()+" P2 pile: "+p2Pile.size());

            }

            // comparisons to determine who has the bigger card
            if (p1Card.getPointValue() > p2Card.getPointValue())
                winner = "p1";
            else if (p2Card.getPointValue() > p1Card.getPointValue())
                winner = "p2";
            else
                winner = "none";

            //put all cards into p1 pile
            if (winner.equals("p1")) {
                //make sure p1 pile has at least 1 card
                while (p1Pile.size() > 0)
                    p1.getCard(p1Pile.remove(0));
                while (p2Pile.size() > 0)
                    p1.getCard(p2Pile.remove(0));
            }

            //put all cards into p2 pile
            if (winner.equals("p2")) {
                //make sure p2 pile has at least 1 card
                while (p2Pile.size() > 0)
                    p2.getCard(p2Pile.remove(0));
                while (p1Pile.size() > 0)
                    p2.getCard(p1Pile.remove(0));
            }

            if (winner.equals("none")) {
                justWarred = true;
                int count = 0;
                /*pull up to 4 cards from each player, if the player has < 4 the last card in the stack is
                 *used to determine winner
                 */
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
        System.out.println("The Winner is " + winner + ".");
    }


    }
