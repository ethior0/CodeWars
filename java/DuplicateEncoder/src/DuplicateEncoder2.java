
public class DuplicateEncoder2 {

	public static String encode( String word ) {
		
		char aux;
		String ans = "";
		word = word.toLowerCase();
		
		for (int i = 0; i < word.length(); i++) {
			aux = word.charAt(i);
			ans += word.indexOf(aux) == word.lastIndexOf(aux) ? "(" : ")";
		}
		
		return ans;
	}
	
 	public static void main( String[] args ) {
 		
 		System.out.println( encode("recede") );
 		
 	}
}
