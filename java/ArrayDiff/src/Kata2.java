
public class Kata2 {

	public static int[] arrayDiff( int[] a, int[] b ) {
		
		int cc = 0;
		int aux[] = new int[a.length];
		
		for ( int i = 0; i < a.length; i++ ) {
			boolean found = false;
			
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					found = true;
					break;
				}
			}
			
			if (!found) {
				aux[cc] = a[i];
				cc++;
			}
		}
		
		int ans[] = new int[cc];
		
		for (int k = 0; k < cc; k++) {
			ans[k] = aux[k];
		}
		
		return ans;
	}
}
