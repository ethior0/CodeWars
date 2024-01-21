
public class SmallestIntegerFinder {

	public static int findSmallestInt(int[] args) {
		
		int s = args[0];
		
		for (int values: args) {
			if (values < s) {
				s = values;
			}
		}
		
		return s;
	}
}
