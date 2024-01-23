
public class Kata {

	public static boolean solution(String str, String ending) {

		if (ending.length() > str.length()) {
			return false;
		} else {
			return (str.substring( str.length() - ending.length(), str.length() ).equals(ending)) ? true : false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(solution("this", "fails"));
		
	}
}
