import java.util.Arrays;

public class Kata {

	public static double findUniq(double arr[]) {

		Arrays.sort(arr);
		double max = arr[arr.length-1];
		double min = arr[0];
		
		return (max == arr[1]) ? min : max;
	}
}
