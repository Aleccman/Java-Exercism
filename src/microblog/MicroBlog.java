/**
 * 
 */
package microblog;

/**
 * @author jhosep
 *
 */
public class MicroBlog {

	public static void main(String[] args) {


	}

	public static String truncate(String input) {
		return input.codePointCount(0, input.length()) > 5 ? input.substring(0, input.offsetByCodePoints(0, 5)) : input;

	}

}
