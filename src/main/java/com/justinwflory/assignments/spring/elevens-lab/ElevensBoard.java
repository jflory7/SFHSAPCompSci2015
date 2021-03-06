import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 * AP Computer Science A 2015
 */
public class ElevensBoard {
  
  /**
   * The size (number of cards) on the board.
   */
  private static final int BOARD_SIZE = 9;
  
  /**
   * The cards on this board.  A "null" value in the array indicates that position
   * on the board is currently empty.
   */
  private Card[] cards;
  
  /**
   * The deck of cards being used to play the current game.
   */
  private Deck deck;
  
  /**
   * Flag used to control debugging print statements.
   */
  private static final boolean DEBUG = true;
  
  
  /**
   * Creates a new <code>ElevensBoard</code> instance using a specified deck size.
   * @param deckSize the number of cards in the deck
   */
  public ElevensBoard() {
    // create the cards array
    cards = new Card[BOARD_SIZE];
    
    // create a deck using the default Deck constructor
    deck = new Deck();
    
    // example of how to put debugging code into a class that only runs
    // during debugging, and does not run under normal operation
    if (DEBUG) {
      System.out.println(deck);
      System.out.println("----------");
    }
    
    // prepare the board for a new game
    deck.shuffle();
    dealMyCards();
  }
  
  /**
   * Start a new game by shuffling the deck and
   * dealing some cards to this board.
   */
  public void newGame() {
    deck.shuffle();
    dealMyCards();
  }
  
  /**
   * Accesses the size of the board.
   * Note that this is not the number of cards it contains,
   * which will be smaller near the end of a winning game.
   * @return the size of the board
   */
  public int boardSize() {
    return cards.length;
  }
  
  /**
   * Determines if the board is empty (has no cards).
   * @return true if this board is empty; false otherwise.
   */
  public boolean isEmpty() {
    for (int i=0; i<cards.length; i++) {
      if (cards[i] != null) return false;
    }
    return true;
  }
  
  /**
   * Deal a card to the kth position in this board.
   * If the deck is empty, the kth card is set to null.
   * @param k the index of the card to be dealt.
   */
  public void deal(int k) {
    this.cards[k] = this.deck.deal();
  }
  
  /**
   * Accesses the deck's number of undealt cards.
   * @return the number of undealt cards left in the deck.
   * DO NOT CHANGE the name of this method.
   * The Deck class method called will vary depending on the name you chose in your class.
   */
  public int deckUndealtCards() {
    return deck.numUndealtCards();
  }
  
  /**
   * Accesses a card on the board.
   * @return the card at position k on the board.
   * @param k is the board position of the card to return.
   */
  public Card cardAt(int k) {
    return cards[k];
  }
  
  /**
   * Replaces selected cards on the board by dealing new cards.
   * @param selectedCards is a list of the indices of the
   *        cards to be replaced.
   */
  public void replaceSelectedCards(List<Integer> selectedCards) {
    for (Integer k : selectedCards) {
      deal(k.intValue());
    }
  }
  
  /**
   * Gets the indexes of the actual (non-null) cards on the board.
   *
   * @return a List that contains the locations (indexes)
   *         of the non-null entries on the board.
   */
  public List<Integer> cardIndexes() {
    List<Integer> selected = new ArrayList<Integer>();
    for (int k = 0; k < cards.length; k++) {
      if (cards[k] != null) {
        selected.add(new Integer(k));
      }
    }
    return selected;
  }
  
  /**
   * Generates and returns a string representation of this board.
   * @return the string version of this board.
   */
  public String toString() {
    String s = "";
    for (int k = 0; k < cards.length; k++) {
      s = s + k + ": " + cards[k] + "\n";
    }
    return s;
  }
  
  /**
   * Determine whether or not the game has been won,
   * i.e. neither the board nor the deck has any more cards.
   * @return true when the current game has been won;
   *         false otherwise.
   */
  public boolean gameIsWon() {
    if (deck.isEmpty()) {
      for (Card c : cards) {
        if (c != null) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  /**
   * Determines if the selected cards form a valid group for removal.
   * In Elevens, the legal groups are (1) a pair(two cards) of non-face cards
   * whose values add to 11, or (2) a group of three cards consisting of
   * a jack, a queen, and a king in some order.
   * @param selectedCards the list of the indices of the selected cards.
   * @return true if the selected cards form a valid group for removal;
   *         false otherwise.
   */
  public boolean isLegal(List<Integer> selectedCards) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    return false; // replace this line when doing Activity 9
  }
  
  /**
   * Determine if there are any legal plays left on the board.
   * In Elevens, there is a legal play if the board contains
   * (1) a pair of non-face cards whose values add to 11, or (2) a group
   * of three cards consisting of a jack, a queen, and a king in some order.
   * @return true if there is a legal play left on the board;
   *         false otherwise.
   */
  public boolean anotherPlayIsPossible() {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    return false; // replace this line when doing Activity 9
  }
  
  
  /**
   * Deal cards to this board to start the game.
   */
  private void dealMyCards() {
    for (int k = 0; k < cards.length; k++) {
      deal(k);
    }
  }
  
  /**
   * Check for an 11-pair in the selected cards.
   * @param selectedCards is a subset of this board.  It is a list
   *                      of indexes into this board that are searched
   *                      to find an 11-pair.
   * @return true if the board entries in selectedCards
   *              contain an 11-pair; false otherwise.
   */
  private boolean containsPairSum11(List<Integer> selectedCards) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    return false; // replace this line when doing Activity 9
  }
  
  /**
   * Check for a JQK in the selected cards.
   * @param selectedCards selects a subset of this board.  It is list
   *                      of indexes into this board that are searched
   *                      to find a JQK group.
   * @return true if the board entries in selectedCards
   *              include a jack, a queen, and a king; false otherwise.
   */
  private boolean containsJQK(List<Integer> selectedCards) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
    return false; // replace this line when doing Activity 9 }
  }
}
/*
 * AP Computer Science A 2015
 */