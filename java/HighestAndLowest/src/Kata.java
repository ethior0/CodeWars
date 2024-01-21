
public class Kata {
	
	public static String highAndLow(String numbers) {
		
		String[] n = numbers.split(" ");
		int max = Integer.parseInt(n[0]), min = Integer.parseInt(n[0]);
		
		for (String values: n) {
			if (Integer.parseInt(values) > max) max = Integer.parseInt(values);
			else if (Integer.parseInt(values) < min)min = Integer.parseInt(values);
		}
		
		return String.format("%d %d", max, min);
	}
}
