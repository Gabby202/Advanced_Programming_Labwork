/**
 * 
 */
package numbersAndStrings;

/**
 * @author Gavi
 *
 */
public class NumberToStringConverter {

	/**
	 * @param num convert num to string
	 * @return snum 
	 */
	public static String convertToString(int num) {
		String snum = null;

		switch (num) {
		case 1:
			snum = "one";
			break;
		case 2:
			snum = "two";
			break;
		case 3:
			snum = "three";
		}

		return snum;
	}
}
