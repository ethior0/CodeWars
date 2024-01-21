
public class Kata {

	public static int[] invert(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = -array[i];
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		
		int res[] = invert(new int[] {-1, 2, -3, 4, -5});
		
		for (int values: res) {
			System.out.print(values + " ");
		}
		
	}
}
