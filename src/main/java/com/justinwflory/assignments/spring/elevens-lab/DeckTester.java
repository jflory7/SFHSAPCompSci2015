//TODO Check that all arrays have the same length, otherwise, throw error
//TODO Check that all arrays are not null, otherwise, throw error

/*
 * Notes for Board.java:
 * - state
 *   - Deck d;
 *   - Card[] board;
 *   - int gamesPlayed;
 *   - int gamesWon;
 *   - ArrayList<Card> selectedCards;
 * - behavior
 *   - replace: check that selected cards are valid; if true, remove and replace if cards left; if false, reject
 *     - Think like: while(!isEmpty) fillSlot;
 *   - restart: empty slots (handled by replacement in array??), shuffle, deal nine cards
 */

/**
 * This is a class that tests the Deck class.
 * SFHS AP Computer Science A 2015
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * All cards created should conform to traditional playing cards, as implemented and enforced
  * by the Card.java solution code from Activity1 (which you should have modified your code to match the
  * behavior, or just adapted the solution code as published).
  * 
  * @param args is not used.
  */
 public static void main(String[] args) {
   Deck badDeck;
   
   String[] ranks = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace",
    "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace",
    "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace",
    "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
   String[] suits = {"spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades",
    "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts",
    "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs",
    "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds"};
   int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13,
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13,
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13,
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13};
   
   Deck deck1 = new Deck(ranks, suits, values);
   Deck deck2 = new Deck();
   //Deck testDeck = new Deck(nullified, hahah, breakme);
   
   System.out.println("Deck 1 toString method reports:");
   System.out.println("    " + deck1);  // the call to toString is implied by referencing deck1 in a String context
   System.out.println("The individual accessor method calls below should return the same values:");
   System.out.println("isEmpty: " + deck1.isEmpty());
   System.out.println("numUndealtCards: " + deck1.numUndealtCards());
   System.out.println();
   
   //testDeck = new Deck(ranks, suits, values);
   //System.out.println("    " + testDeck);
 }
}
