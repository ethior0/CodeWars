
public class PangramChecker {

	public static boolean check(String sentence) {
		
		int cc = 0;
		sentence = sentence.toLowerCase();
		
		for (char c = 'a'; c <= 'z'; c++) {
			for (int j = 0; j < sentence.length(); j++) {
				if (sentence.charAt(j) == c) {
					cc++;
					break;
				} 
			}
		}
		
		return cc == 26 ? true : false;
	}
}
