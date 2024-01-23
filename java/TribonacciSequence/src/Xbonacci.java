
public class Xbonacci {

	public static double[] tribonacci(double[] s, int n) {
		
		double[] seq = new double[n];
		
		if (n > 3) {
			seq[0] = s[0];
			seq[1] = s[1];
			seq[2] = s[2];
			for (int i = 3; i < n; i++) {
				seq[i] = seq[i-1] + seq[i-2] + seq[i-3];
			}
			
		} else {
			for (int j = 0; j < n; j++) {
				seq[j] = s[j];
			}
		} 
		
		return seq;
	}
}

