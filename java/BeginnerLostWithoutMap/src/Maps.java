//import java.util.Arrays;

public class Maps {

	public static int[] map(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		
		return arr;
		
//		return Arrays.stream(arr).map(x -> x*2).toArray();
	}
}
