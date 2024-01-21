
public class CharProblem {

	public static int howOld( final String herOld ) {
		
		return herOld.charAt(2) - '1';
		
//		return Integer.parseInt( String.valueOf( herOld.charAt(0) ) );
	}
	
	public static void main( String[] args ) {
		
		int res = howOld("2 years old");
		System.out.println(res);
		
	}
}
