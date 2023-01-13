/**
 * 
 */
package secondexercismJava;

/**
 * @author jhosep
 *
 */
public class Lasagna {

	public static void main(String[] args) {
		

	}

	public static int expectedMinutesInOven() {
		return 40;
	}

	public static int remainingMinutesInOven(int value) {
		return expectedMinutesInOven() - value;
	}

	public static int preparationTimeInMinutes(int valueOne) {
		return valueOne *= 2;
	}

	public static int totalTimeInMinutes(int valueOne, int valueTwo) {

		return preparationTimeInMinutes(valueOne) + valueTwo;
	}
}
