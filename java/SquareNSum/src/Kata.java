
public class Kata {

	public static int squareSum(int[] n) {
		
		int sum = 0;
		
		for (int values: n) {
			sum += Math.pow(values, 2);
		}
		
		return sum;
	}
}
