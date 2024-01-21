
public class Arge {

	public static int nbYear(int p0, double percent, int aug, int p) {
		
		int years = 0;
		
		do {
			p0 += p0 * percent/100 + aug;
			years++;
			
		} while (p0 < p);

		return years;
	}
}
