
public class Banjo {
	public static String areYouPlayingBanjo (String name) {
		
		String a = "";
//		char letter = name.charAt(0);
		
//		if (letter == 'R' || letter == 'r')
		if (name.startsWith("R") || name.startsWith("r")) {
			a = name + " plays banjo";
		} else {
			a = name + " does not play banjo";
		}
		
		return a;
	}
	
}


