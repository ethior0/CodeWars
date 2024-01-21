
public class Kata {

	public static int expressionsMatter ( int a, int b, int c ) {
		
		int max;
		
		int o1 = a * (b + c);
		int o2 = a * b * c;
		max = Math.max(o1, o2);
		int o3 = a + b * c;
		max = Math.max(max, o3);
		int o4 = (a + b) * c;
		max = Math.max(max, o4);
		int o5 = a + b + c;
		max = Math.max(max, o5);
		
		return max;
	}
	
	public static void main( String[] args ) {
		
		System.out.println( expressionsMatter(9, 1, 1) );
		
	}
}
