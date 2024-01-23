
public class Converter {

	public static int binToDecimal(String inp) {
		
		return Integer.parseInt(inp, 2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(binToDecimal("1001001"));
	}
}
