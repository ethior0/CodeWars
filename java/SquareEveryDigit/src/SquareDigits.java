
public class SquareDigits {

	public static int squareDigits(int n) {
		
		String ans = "", num = Integer.toString(n);
		
		for (int i = 0; i < num.length(); i++) {
			int aux = Integer.parseInt(num.charAt(i) + "");
			ans += aux * aux;
		}
		
		return Integer.valueOf(ans);
	}
}
