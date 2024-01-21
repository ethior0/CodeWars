
public class FindDivisor {

	public static long numberOfDivisors(int n) {
		
		int cc = 1;
		
		for (int i = 1; i <= n/2; i++) {
			boolean div = true;
			
			if (n % i == 0) {
				div = false;
			}
			
			if (!div) {
				cc++;
			}
		}
		
		return cc;
	}
	
	public static void main(String[] args) {
		
		System.out.println(numberOfDivisors(12));
		
	}
}
