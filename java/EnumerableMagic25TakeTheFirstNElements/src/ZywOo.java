
public class ZywOo {

	public static int[] take(int[] arr, int n) {
		
		if (arr.length >= n) {
			int[] list = new int[n];
			
			for (int i = 0; i < n; i++) {
				list[i] = arr[i];
			}
			
			return list;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] teste = {20, -72, -64, -48, 10, -29, 36, -15, 65, -64, 7, 17, 6, 45, -9, -61, 42, 73, -24, 68, 12, 37, -26, 0, 75, 25, -72, 77, 43, -45, 55, -8, 16, 8, 20, 26, -20, 28, -55, 12, -61, 39, -4, -24, 57, 7, -57, -72, 5, 72, -36, 5, 25, -54, -6, -22, -26, 15, -67, 49, 47, -61, -44, 31, 49, 33, 34, 33, -43, -5};
		int[] res = take(teste, 1);
		
		for (int values: res) {
			System.out.println(values);
		}
	}
}
