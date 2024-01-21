
public class FakeBinary {

	public static String fakeBin(String numberString) {
		
		for (int i = 0; i<numberString.length(); i++) {
			if (numberString.charAt(i) == '0' || numberString.charAt(i) == '1' || numberString.charAt(i) == '2' || numberString.charAt(i) == '3' || numberString.charAt(i) == '4') {
				numberString = numberString.replace(numberString.charAt(i), '0');
			}
		}
		
		for (int i = 0; i<numberString.length(); i++) {
			if (numberString.charAt(i) != '0' && numberString.charAt(i) != '1' && numberString.charAt(i) != '2' && numberString.charAt(i) != '3' && numberString.charAt(i) != '4') {
				numberString = numberString.replace(numberString.charAt(i), '1');
			}
		}
		
		return numberString;
	}
}
