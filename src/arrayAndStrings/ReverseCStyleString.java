package arrayAndStrings;

public class ReverseCStyleString {
	/**
	 * Write code to reverse a C-Style String. (C-String means that “abcd” is
	 * represented as five characters, including the null character.) C-style,
	 * last character is the null character. Ignore the last character when
	 * reverse the string
	 * 
	 * @param str
	 * @return
	 */
	public String reverseCstyleString(String str) {
		if (str == null) {
			return str;
		}
		int start = 0;
		int end = str.length() - 2;
		int middle = str.length() / 2 - 1;
		char[] chars = str.toCharArray();
		while (start <= middle && end >= middle) {

			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			--end;
			++start;
		}
		System.out.println(new String(chars));
		return new String(chars);
	}
}
