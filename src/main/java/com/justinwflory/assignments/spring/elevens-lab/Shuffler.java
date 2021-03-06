/**
 * This class provides a convenient way to test shuffling methods.
 * SFHS AP Computer Science 2015
 */
public class Shuffler {
  
  /**
   * The number of consecutive shuffle steps to be performed in each call
   * to each sorting procedure. Experiement with different values.
   */
  private static final int SHUFFLE_COUNT = 8;
  
  /**
   * The number of values to fill the values array with. Experiment with different values,
   * including both even numbers and odd numbers.
   */
  private static final int VALUE_COUNT = 52;
  
  
  /**
   * Tests shuffling methods.
   * @param args is not used.
   */
  public static void main(String[] args) {
    System.out.println("Results of " + SHUFFLE_COUNT +
                       " consecutive perfect shuffles:");
    
    int[] values1 = new int[VALUE_COUNT];
    for (int i = 0; i < VALUE_COUNT; i++) {
      values1[i] = i;
    }
    
    for (int j = 1; j <= SHUFFLE_COUNT; j++) {
      perfectShuffle(values1);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values1.length; k++) {
        System.out.print(" " + values1[k]);
      }
      System.out.println();
    }
    System.out.println();
    
    System.out.println("Results of " + SHUFFLE_COUNT +
                       " consecutive efficient selection shuffles:");
    
    int[] values2 = new int[VALUE_COUNT];
    for (int i = 0; i < VALUE_COUNT; i++) {
      values2[i] = i;
    }
    
    for (int j = 1; j <= SHUFFLE_COUNT; j++) {
      selectionShuffle(values2);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values2.length; k++) {
        System.out.print(" " + values2[k]);
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /**
   * Apply a "perfect shuffle" to the argument.
   * The perfect shuffle algorithm splits the deck in half, then interleaves
   * the cards in one half with the cards in the other.
   * @param values is an array of integers simulating cards to be shuffled.
   */
  public static void perfectShuffle(int[] values) {
    int[] shuffled = new int[VALUE_COUNT];
    int indexCount = 0;
    
    for (int i=0; i<VALUE_COUNT/2; i++) {
      shuffled[indexCount] = values[i];
      indexCount += 2;
    }
    
    indexCount = 1;
    
    for (int i=VALUE_COUNT/2; i<shuffled.length; i++) {
      if (indexCount == shuffled.length) break;
      shuffled[indexCount] = values[i];
      indexCount += 2;
    }
    
    for (int i=0; i<VALUE_COUNT; i++) {
      values[i] = shuffled[i];
    }
  }
  
  
  /**
   * Apply an "efficient selection shuffle" to the argument.
   * The selection shuffle algorithm conceptually maintains two sequences
   * of cards: the selected cards (initially empty) and the not-yet-selected
   * cards (initially the entire deck). It repeatedly does the following until
   * all cards have been selected: randomly remove a card from those not yet
   * selected and add it to the selected cards.
   * An efficient version of this algorithm makes use of arrays to avoid
   * searching for an as-yet-unselected card.
   * @param values is an array of integers simulating cards to be shuffled.
   */
  public static void selectionShuffle(int[] values) {
    int indexCount = VALUE_COUNT - 1;
    int randomInt;
    int temp;
    
    for (indexCount=indexCount; indexCount>1; indexCount--) {
      randomInt = (int) (Math.random() * VALUE_COUNT);
      temp = values[indexCount];
      values[indexCount] = values[randomInt];
      values[randomInt] = temp;
    }
  }
}