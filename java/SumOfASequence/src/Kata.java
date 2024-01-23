
public class Kata {

	public static int sequenceSum( int start, int end, int step ) {
	
		int cc = start, sum = start + step;
		
		while (sum <= end) {
			cc += sum;   
			sum += step;
		}
		
		return start > end ? 0 : cc;
	}
	
	public static void main( String[] args ) {
		
		System.out.println( sequenceSum(16, 15, 3) );
		
	}
}
