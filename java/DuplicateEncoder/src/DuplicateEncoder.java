
public class DuplicateEncoder {

	public static String encode( String word ) {
		
		int cc;
		String ans = "";
		
		for (int i = 0; i < word.length(); i++) {
			cc = 0;
			
			for (int j = 0; j < word.length(); j++) {
				if ( word.toLowerCase().charAt(i) == word.toLowerCase().charAt(j) ) {
					cc++;
				}
			}
			
			if (cc == 1) ans += "(";
			else ans += ")";
		}
		
		return ans;
	}
	
	public static void main( String[] args ) {
		
		System.out.println( encode("recede") );
		
	}
}
