
public class Codewars {

	public static String oddOrEven(int[] array) {
		
		int sum = 0;
		
		for (int values: array) {
			sum += values;
		}
		
		return sum % 2 == 0 ? "even" : "odd";
	}
}
