/**
 * 
 */
package birdwatcher;

/**
 * @author jhosep
 *
 */
public class BirdWatcher {

//	private static int[] countlastWeek = new int[] { 0, 2, 5, 3, 7, 8, 4 };

	public static int[] countBirds = { 0, 2, 5, 3, 7, 8, 4 };

	public static void main(String[] args) {

		for (int count : countBirds) {
			System.out.println(count);
		}
	}

	public static int[] getLastWeek() {
		return countBirds;
	}

	public static int getToday() {
		throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
	}

	public static void incrementTodaysCount() {
		throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
	}

	public static boolean hasDayWithoutBirds() {
		throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
	}

	public static int getCountForFirstDays(int numberOfDays) {
		throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
	}

	public static int getBusyDays() {
		throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
	}

}
