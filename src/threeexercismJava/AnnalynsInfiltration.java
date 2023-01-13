/**
 * 
 */
package threeexercismJava;

/**
 * @author jhosep
 *
 */
public class AnnalynsInfiltration {

	public static void main(String[] args) {

	}

	/**
	 * Implement the (static) AnnalynsInfiltration.canFastAttack() method that takes
	 * a boolean value that indicates if the knight is awake. This method returns
	 * true if a fast attack can be made based on the state of the knight.
	 * Otherwise, returns false:
	 */

	public static boolean annalysInfiltrationCanFasAttack(boolean parameterOne) {
		return parameterOne;

	}

	/**
	 * Implement the (static) AnnalynsInfiltration.canSpy() method that takes three
	 * boolean values, indicating if the knight, archer and the prisoner,
	 * respectively, are awake. The method returns true if the group can be spied
	 * upon, based on the state of the three characters. Otherwise, returns false:
	 */

	public static boolean annalynsInfiltrationcanSpy(boolean[] parameterOne) {
		for (boolean b : parameterOne) {
			if (b) {
				return b;
			}

		}
		return false;

	}

	/**
	 * Implement the (static) AnnalynsInfiltration.canSignalPrisoner() method that
	 * takes two boolean values, indicating if the archer and the prisoner,
	 * respectively, are awake. The method returns true if the prisoner can be
	 * signalled, based on the state of the two characters. Otherwise, returns false
	 */

	/**
	 * Implement the (static) AnnalynsInfiltration.canFreePrisoner() method that
	 * takes four boolean values. The first three parameters indicate if the knight,
	 * archer and the prisoner, respectively, are awake. The last parameter
	 * indicates if Annalyn's pet dog is present. The method returns true if the
	 * prisoner can be freed based on the state of the three characters and
	 * Annalyn's pet dog presence. Otherwise, it returns false:
	 */
}
