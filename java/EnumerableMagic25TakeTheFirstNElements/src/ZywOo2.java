import java.util.Arrays;

public class ZywOo2 {

	public static int[] take(int[] arr, int n) {
		
		// isso que dá nao ler a descriçao do problema intera rs
		return arr.length < n ? arr : Arrays.copyOf(arr, n);
	}
}
