
public class FakeBinary03 {

	public static String fakeBin(String numberString) {
		
		numberString = numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
		
		return numberString;
	}
	
	public static void main(String[] args) {
		
		String res = fakeBin("140912");
		System.out.println(res);
	}
}
