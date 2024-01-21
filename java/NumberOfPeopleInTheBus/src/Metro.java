import java.util.ArrayList;

public class Metro {

	public static int countPassengers(ArrayList<int[]> stops) {
		
		int res = 0;
		
		for (int i = 0; i < stops.size(); i++) {
			
			int[] values = stops.get(i);
			res += values[0] - values[1];;
		}
		
		
		return res;
	}
}
