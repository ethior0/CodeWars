
public class Printer {

	public static String printerError(String s) {
		
		int letter = 0;
		
		for (int i = 0; i < s.length(); i++) {
			for (char l = 'a'; l <= 'm'; l++) {
				if (s.charAt(i) == l) letter++;
			}
		}
		
		return String.format("%d/%d", (s.length()-letter), s.length());
	}
}
