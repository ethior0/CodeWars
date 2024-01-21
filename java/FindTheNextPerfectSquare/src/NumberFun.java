
public class NumberFun {

	public static long findNextSquare(long sq) {
		
		if (Math.round(Math.sqrt(sq)) * Math.round(Math.sqrt(sq)) == sq) {
			long next = (int) Math.sqrt(sq) + 1;
			
			return next * next;
		} else {
			return -1;
		}
	}
}
