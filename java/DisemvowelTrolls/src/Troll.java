
public class Troll {

	public static String disemvowel(String str) {
		
		String sentence = "";
		
		for (int i = 0; i < str.length(); i++) {

			char actual = str.charAt(i);
			
			if (actual == 'a' || actual == 'A' || actual == 'e' || actual == 'E' || actual == 'i' || actual == 'I' || actual == 'o' || actual == 'O' || actual == 'u' || actual == 'U') {
				sentence += "";
			} else {
				sentence += actual;
			}
		}
		
		return sentence;
	}
}
