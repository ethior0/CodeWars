
public class SpinWords {

	public static String spinWords(String sentence) {
		
		String[] words = sentence.split(" ");
		String finalS = "", rev = "";
		
		for (int k = 0; k<words.length; k++) {
			
			if (words[k].length() >= 5) {
				char[] reverse = new char[words[k].length()];
				
				//reversing word
				for (int i = 0, j = words[k].length()-1; i<words[k].length(); i++, j--) {
					reverse[i] = words[k].charAt(j);
				}
				
				rev = rev.valueOf(reverse);
				
				if (k == words.length-1) {
					finalS += rev;
				} else {
					finalS += rev + " ";
				}
			} else {
				if (k == words.length-1) {
					finalS += words[k];
				} else {
					finalS += words[k] + " ";
				}
			}
		}
		
		return finalS;
	}
	
}
