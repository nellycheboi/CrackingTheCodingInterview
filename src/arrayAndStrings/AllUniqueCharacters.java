package arrayAndStrings;

public class AllUniqueCharacters {
	/**
	 * Implement algorithm to determine is all unique characters.
	 * 
	 * @questions What kind of character encoding is it? case insensitive?
	 *            alphanumeric?
	 * @logic if it is just basic plain text then use bit manipulation otherwise
	 *        use array
	 * @param str
	 * @return boolean
	 */
	public boolean allUniqueChars(String str) {

		return isAllUniqueCharsBits(str);
	}

	/**
	 * assuming str is a simple ASCII encoding and uniqueness is case
	 * insensitive
	 * 
	 * @param str_in
	 * @return
	 */
	private boolean isAllUniqueCharsBits(String str_in) {
		if (str_in == null) {
			return false;
		}
		String str = str_in.toLowerCase();
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i) - 97;
			if ((checker & (1 << c)) > 0) {
				return false;
			} else {
				checker = checker | (1 << c);
			}
		}
		return true;
	}

	/**
	 * easier to read same runtime as bits just a requires a little more space
	 * depending on the encoding
	 * 
	 * @param str
	 * @return
	 */
	private boolean isAllUniqueCharsArrays(String str) {
		boolean[] chars = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			if (chars[c]) {
				return false;
			} else {
				chars[c] = true;
			}
		}
		return true;
	}

}
