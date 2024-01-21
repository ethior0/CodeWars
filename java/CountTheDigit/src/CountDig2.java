
public class CountDig2 {

	public static int nbDig( int n, int d ) {
		
		int count = 0;
		
		for (int i = 0; i <= n; i++) { 
			String k = String.valueOf(i * i);
			count += (k.length() - k.replaceAll(String.valueOf(d), "").length());
		}
		
		return count;
	}
	
	public static void main( String[] args ) {
		
		System.out.println( nbDig(25, 1) );
		
	}
}
