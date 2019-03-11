package activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck test = new Deck(new String[] {"jack","queen","king"}, 
				new String[] {"blue", "red"}, 
				new int[] {11, 12, 13});
		System.out.println(test.isEmpty());
		System.out.println(test.deal());
		System.out.println(test);
		
		Deck test2 = new Deck(new String[] {"Ace", "Two", "Three"}, 
				new String[] {"red", "black"}, 
				new int[] {1, 2, 3});
		System.out.println(test2.deal());
		System.out.println(test2);

		Deck test3 = new Deck(new String[] {"Jack", "Queen", "King", "Ace"},
				new String[] {"Spades", "Hearts", "Diamonds", "Clubs"},
				new int[] {10, 10, 10, 1});
		System.out.println(test3.deal());
		System.out.println(test3);
		
	}
}