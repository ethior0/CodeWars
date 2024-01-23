
public class RowSumOddNumbers {

	public static int rowSumOddNumbers( int n ) {
        
		int row = 0, sum = 1, num = -1, qNum = 1;
		
		while (row != n) {
			sum = 0;
			for (int i = 0; i < qNum; i++) { //
				num += 2;
				sum += num;
			}
			qNum++;
			row++;
		}
		
		return sum;
    }
	
	public static void main( String[] args ) {
		
		System.out.println( rowSumOddNumbers(1) );
		
	}
}
