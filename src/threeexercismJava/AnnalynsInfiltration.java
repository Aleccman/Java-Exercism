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

//      Value method one

		boolean  valueMethodOne =annalysInfiltrationCanFasAttack(false);
		System.out.println(valueMethodOne);

//		Value method two
		
		boolean valueMethodTwo = annalynsInfiltrationcanSpy(false, false, false);
		System.out.println(valueMethodTwo);

//      Value method three

		boolean valueMethodThree =annalynsInfiltrationCanSignalPrisoner(false, true);
		System.out.println(valueMethodThree);

//      Value method four
		
		boolean valueMethodFour = annalynsInfiltrationCanFreePrisoner(true, false, true, true);
		System.out.println(valueMethodFour);

	}

	/**
	 * Implement the (static) AnnalynsInfiltration.canFastAttack() method that takes
	 * a boolean value that indicates if the knight is awake. This method returns
	 * true if a fast attack can be made based on the state of the knight.
	 * Otherwise, returns false:
	 */

	public static boolean annalysInfiltrationCanFasAttack(boolean knightIsAwake) {
		if (knightIsAwake == true) {
			return true;
		}
		return false;
	}

	/**
	 * Implement the (static) AnnalynsInfiltration.canSpy() method that takes three
	 * boolean values, indicating if the knight, archer and the prisoner,
	 * respectively, are awake. The method returns true if the group can be spied
	 * upon, based on the state of the three characters. Otherwise, returns false:
	 */

	public static boolean annalynsInfiltrationcanSpy(boolean knightIsAwake, boolean archerIsAwake,
			boolean prisonerIsAwake) {
		if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true)
			return true;
		return false;
	}

	/**
	 * Implement the (static) AnnalynsInfiltration.canSignalPrisoner() method that
	 * takes two boolean values, indicating if the archer and the prisoner,
	 * respectively, are awake. The method returns true if the prisoner can be
	 * signalled, based on the state of the two characters. Otherwise, returns false
	 */

	public static boolean annalynsInfiltrationCanSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
		if (prisonerIsAwake== true && archerIsAwake==false) {
			return true;
		}
		return false;
	}
	
	/**
	 * Implement the (static) AnnalynsInfiltration.canFreePrisoner() method that
	 * takes four boolean values. The first three parameters indicate if the knight,
	 * archer and the prisoner, respectively, are awake. The last parameter
	 * indicates if Annalyn's pet dog is present. The method returns true if the
	 * prisoner can be freed based on the state of the three characters and
	 * Annalyn's pet dog presence. Otherwise, it returns false:
	 */

	public static boolean annalynsInfiltrationCanFreePrisoner(boolean knightIsAwake, boolean archerIsAwake,
			boolean prisonerIsAwake, boolean petDogIsPresent) {
		if (petDogIsPresent == true && archerIsAwake == false) {
			return true;
		} else if (prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false) {
			return true;
		} else if (prisonerIsAwake == false) {
			return false;
		}
		return false;
	}
}
