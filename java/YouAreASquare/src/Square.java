
public class Square {

	public static boolean isSquare(int n) {
		
		if (n >= 0) {
			for (int i = 0; i <= n; i++) {
				if (Math.pow(i, 2) == n) return true;
				if (Math.pow(i, 2) > n) return false;
			}
		} else {
			return false;
		}
		return false;
	}
}
