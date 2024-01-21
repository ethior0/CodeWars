
public class DigPow {

	public static long digPow(int n, int p){
		
		long k = 0;
		String digits = String.valueOf(n);
		
		for (int i = 0; i < digits.length(); i++, p++) {
			k += Math.pow( Integer.parseInt(String.valueOf(digits.charAt(i))), p );
		}
		
		return (k % n == 0) ? k / n : -1;
	}
}
