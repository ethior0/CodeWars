
public class Money {

	public static int calculateYears( double p, double i, double t, double d ) {
		
		int y = 0;
		double res;
		
		while (p < d) {
			res = p * i;
			p += res * (1 - t);
			y++;
		}
		
		return y;
	}
	
	public static void main( String[] args ) {
		
		System.out.println( calculateYears(1000,0.05,0.18,1100) );
		
	}
}
