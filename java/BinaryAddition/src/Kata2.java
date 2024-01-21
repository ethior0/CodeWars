
public class Kata2 {

	public static String binaryAddition(int a, int b) {
		
		String sen = "";
		int sum = a + b, rest;
		
		while (sum != 0) {
			rest = sum % 2;
			sum = sum / 2;
			sen += rest;
		}
		
		StringBuilder sb = new StringBuilder(sen);
		
		return String.valueOf(sb.reverse());
	}
}
