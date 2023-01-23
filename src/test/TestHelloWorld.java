/**
 * 
 */
package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import firstexercismJava.HelloWorld;

/**
 * @author jhosep
 *
 */
public class TestHelloWorld {

	HelloWorld helloWorld = new HelloWorld();

	public static void main(String[] args) {
		returnString("hello");
	}

	@Test
	public static void returnString(String parameter) {
		assertNotNull(parameter);

	}

}
