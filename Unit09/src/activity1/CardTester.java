package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		Card c1 = new Card("6","Heart", 6);
		Card c2 = new Card("6","Heart", 6);
		Card c3 = new Card("Heart", "Jack", 11);
		
		System.out.println(c1.toString());/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		System.out.println("Card 1 and Card 2 should match: " + c2.matches(c1));
		System.out.println("Card 2 and Card 3 should not match: " + !c2.matches(c3));
	}
}
