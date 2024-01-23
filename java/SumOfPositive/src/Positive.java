
public class Positive {

	public static int sum(int[] arr) {
		
		int sum = 0;
		
		for (int values: arr) {
			if (values > 0) sum += values;
		}
		
		return sum;
	}
}
