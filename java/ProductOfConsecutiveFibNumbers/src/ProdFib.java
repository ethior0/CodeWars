
public class ProdFib {

	public static long[] productFib(long prod) {
		
		long a = 0, b = 1, c = 0;
		
		while (a * b < prod) {
			c = a + b;
			a = b;
			b = c;
		}
		
		return new long[] {a, b, a * b == prod ? 1 : 0};
	}
	
	public static void main(String[] args) {
		
		long res[] = productFib(5895);
		
		for (long values: res) {
			System.out.println(values);
		}
		
	}
}
