
public class Solution {

	public static String doubleChar(String s) {
//		
//		String ans = "";
//		
//		for (int i = 0; i < s.length(); i++) {
//			 ans = ans + s.charAt(i) + s.charAt(i);
//		}
//		
//		return ans;
		
		return s.replaceAll(".", "$0$0");
	}
	
	public static void main(String[] args) {
		
		System.out.println(doubleChar("Thiagolas"));
		
	}
}
