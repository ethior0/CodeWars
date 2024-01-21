import java.util.Arrays;

public class Kata {

	public static int[] sortArray(int[] array) {
		
		int cc = 0, cc2 = 0;
		
		for (int value1: array) {
			if (value1%2 != 0) {
				cc2++;
			}
		}
		
		int[] ar = new int[cc2];
		for (int value: array) {
			if (value%2 != 0) {
				ar[cc] = value; 
				cc++;
			}
		}
		
		cc = 0;
		Arrays.sort(ar);
		for (int i = 0; i<array.length; i++) {
			if (array[i]%2 != 0) {
				array[i] = ar[cc];
				cc++;
			}
		}
		
		return array;
	}

}
