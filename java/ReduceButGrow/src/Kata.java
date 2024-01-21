
public class Kata {

	public static int grow(int[] x) {
		
		int r = 1;
		
		for (int value: x) {
			r *= value;
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		
		int res = grow(new int[]{1, 2, 3,4 });
		System.out.println(res);
	}
}
