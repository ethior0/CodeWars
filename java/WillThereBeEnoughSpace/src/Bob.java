
public class Bob {

	public static int enough(int cap, int on, int wait) {
		
		return wait <= cap - on ? 0 : Math.abs(cap - on - wait);
	}
}
