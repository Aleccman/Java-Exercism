/**
 * 
 */
package blackjack;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jhosep
 *
 */
public class Blackjack {

	private static final int BLACKJACK = 21;

	private static final String STAND = "S";
	private static final String HIT = "H";
	private static final String SPLIT = "P";
	private static final String AUTOMATICALLY_WIN = "W";

	public static Map<String, Integer> cardValue = new HashMap<String, Integer>();

	public static void main(String[] args) {

		cardValue.put("ace", 11);
		cardValue.put("two", 2);
		cardValue.put("three", 3);
		cardValue.put("four", 4);
		cardValue.put("five", 5);
		cardValue.put("six", 6);
		cardValue.put("seven", 7);
		cardValue.put("eight", 8);
		cardValue.put("nine", 9);
		cardValue.put("ten", 10);
		cardValue.put("jack", 10);
		cardValue.put("queen", 10);
		cardValue.put("king", 10);
		cardValue.put("other", 0);

		System.out.println(isBlackjack("ace", "ten"));

	}

	public static int parseCard(String card) {
		return cardValue.get(card.toLowerCase());

	}

	public static boolean isBlackjack(String card1, String card2) {
		return (parseCard(card1.toLowerCase()) + (parseCard(card2.toLowerCase())) == BLACKJACK) ? true : false;
	}

	public static String largeHand(boolean isBlackjack, int dealerScore) {
		if (!isBlackjack) {
			return SPLIT;
		} else if (dealerScore < 10) {
			return AUTOMATICALLY_WIN;
		} else {
			return STAND;
		}
	}

	public static String smallHand(int handScore, int dealerScore) {
		if (handScore > 16) {
			return STAND;
		} else if (handScore < 12 && dealerScore > 6) {
			return HIT;
		}
		return STAND;

	}

	// FirstTurn returns the semi-optimal decision for the first turn, given the
	// cards of the player and the dealer.
	// This function is already implemented and does not need to be edited. It pulls
	// the other functions together in a
	// complete decision tree for the first turn.

	public static String firstTurn(String card1, String card2, String dealerCard) {
		int handScore = parseCard(card1) + parseCard(card2);
		int dealerScore = parseCard(dealerCard);

		if (20 < handScore) {
			return largeHand(isBlackjack(card1, card2), dealerScore);
		} else {
			return smallHand(handScore, dealerScore);
		}
	}

}
