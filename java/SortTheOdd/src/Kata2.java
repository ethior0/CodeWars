import java.util.ArrayList;

public class Kata2 {

	public static int[] sortArray(int[] array) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int odd: array) {
			if (odd%2 != 0) {
				al.add(odd);
			}
		}
		
		al.sort(null);
		
		for (int i = 0, j = 0; i < array.length; i++) {
			
			if (array[i]%2 != 0) {
				array[i] = al.get(j);
				j++;
			}
			
		}
		
		return array;
	}
	
}
