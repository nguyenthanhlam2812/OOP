import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		if (str.isEmpty())  return 0;

		int maxrun = 1; int cnt = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				cnt++;
			} 
			else {
				maxrun = Math.max(maxrun, cnt);
				cnt = 1;
			}
		}
		return Math.max(maxrun, cnt); // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		// Kiểm tra chuỗi rỗng hay không
		if (str.isEmpty()) return null; // YOUR CODE HERE
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) { // kiểm tra có phải là kí tự số không
				if (i < str.length() - 1) {
					c = c - '0';
					char a = str.charAt(i + 1);
					for (int j = 0; j < c; j++) {
						result += a;
					}
				}
			} else {
				result += c;
			}
		}
		return result;
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		if (len < 1 || a.length() < len || b.length() < len ) return false; // YOUR CODE HERE

		HashSet<String> xauA = new HashSet<>();
		// thêm xâu có độ dài = len của a vào HashSet
		for (int i = 0; i < a.length() - len; i++) {
			xauA.add(a.substring(i, i + len));
			// phương thức substring trích xuất 1 phần chuỗi
		}
		// kiểm tra trong b có chứa xâu con có độ dài = len không
		// dùng contains trong HashSet
		for (int i = 0; i < b.length() - len; i++) {
			if (xauA.contains(b.substring(i, i +len))) {
				return true;
			}
		}
		return false;
	}
}
