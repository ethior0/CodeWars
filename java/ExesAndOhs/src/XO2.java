
public class XO2 {

	public static boolean getXO(String str) {

		str = str.toLowerCase();
		
		return (str.replace("x", "").length() == str.replace("o", "").length());
	}
}
