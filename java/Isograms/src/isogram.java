
public class isogram {

	public static boolean isIsogram(String str) {
		
		char[] letters = str.toCharArray();
		
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				if (String.valueOf(letters[i]).equalsIgnoreCase(String.valueOf(letters[j])) && i != j) {
					return false;
				}
			}
		}
		
		return true;
	}
}
