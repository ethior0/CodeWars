
public class Printer2 {

	public static String printerError(String s) {
		
		return s.replaceAll("[a-m]", "").length() + "/" + s.length();
	}
	
	public static void main(String[] args) {
		System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
	}
}
