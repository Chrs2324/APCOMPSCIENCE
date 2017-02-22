/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		Card card1 = new Card("ace","spades",11);
		Card card2 = new Card("king","hearts",10);
		Card card3 = new Card("queen","diamonds",10);

		System.out.println("Card 1 is: " + card1.matches(card1));
		System.out.println("Card 2 is: " + card2.matches(card2));
		System.out.println("Card 3 is: " + card3.matches(card3));
		System.out.println();
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}
}
