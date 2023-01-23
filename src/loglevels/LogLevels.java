/**
 * 
 */
package loglevels;

/**
 * @author jhosep
 *
 */
public class LogLevels {

	public static void main(String[] args) {

//		String value = ("[ERROR]: Invalid operation");
//		String value2 = ("[WARNING]:  Disk almost full\r\n");
		String value3 = ("[INFO]: Operation completed");

		String valuefour = reformat(value3);
		System.out.println(valuefour);

	}

	public static String message(String logLine) {
		return logLine.substring(logLine.indexOf(":") + 1).trim();

	}

	public static String logLevel(String logLine) {
		return logLine.substring(1, logLine.indexOf(":") - 1).toLowerCase();
	}

	public static String reformat(String logLine) {
		return String.format("%s (%s)", message(logLine),logLevel(logLine));

	}

}
