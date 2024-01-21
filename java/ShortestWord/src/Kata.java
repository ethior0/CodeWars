
public class Kata {

	public static int findShort(String s) {
		
		String[] words = s.split(" ");
		int minor = 5;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() <= minor) {
				minor = words[i].length();
			}
		}
		
		return minor;
	}
}
