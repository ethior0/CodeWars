
public class CountDig {

	public static int nbDig( int n, int d ) {
		
		int cc = 0, count = 0, k;
		
		while (cc <= n) {
			k = cc * cc;
			for (int i = 0; i < String.valueOf(k).length(); i++) {
				if (Integer.parseInt(String.valueOf(k).charAt(i) + "") == d) {
					count++;
				}
			}
			cc++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		System.out.println( nbDig(11011, 2) );
		
	}
}
