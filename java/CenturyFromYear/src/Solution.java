
public class Solution {

	public static int century( int number ) {
		
		int century = 0;
		
		if ( number % 100 == 0 ) {
			century = number/100;
		} else if ( number % 100 != 0 ){
			century = number / 100 + 1;
		}
		
		return century;
	}
}
