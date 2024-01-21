
public class Troll2 {

	public static String disemvowel(String str) {
		
		return str.replaceAll("[aAeEiIoOuU]", "");
	}
	
	public static void main(String[] args) {
		
		System.out.println(disemvowel("What are you, a communist?"));
		
	}
}