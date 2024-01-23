import java.util.Arrays;

public class AreSame2 {
	
	public static boolean comp( int[] a, int[] b ) {
		
		if ( (a == null || b == null) || (a.length != b.length) ) {
			return false;
		} else {
			for ( int k = 0; k < a.length; k++ ) {
				a[k] = a[k] * a[k];
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			return Arrays.equals(a, b);
		}
	}
}
