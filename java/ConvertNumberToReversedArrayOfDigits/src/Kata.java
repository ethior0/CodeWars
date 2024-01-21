
public class Kata {

	public static int[] digitize(long n) {
		
		int[] array = new int[String.valueOf(n).length()];
		
		for (int i = 0, j = array.length-1; i < array.length; i++, j--) {
			int num = Integer.parseInt( String.valueOf(String.valueOf(n).charAt(i)) );
			array[j] = num;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		
		int res[] = digitize(35231);
		
		for (int values: res) {
			System.out.println(values);
		}
	}
}
