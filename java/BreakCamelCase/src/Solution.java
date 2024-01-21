
public class Solution {

	public static String camelCase(String input) {
		
		String sen = "";
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == Character.toUpperCase(input.charAt(i))) {
				sen += " " + input.charAt(i);
			} else {
				sen += input.charAt(i);
			}
		}
		
		return sen;
	}
}
