
public class PiApprox2 {

	public static String iterPi2String(Double epsilon) {
		
		int cc = 0, cc2 = 1;
		double calc = 0.0;
		
		while (Math.abs(calc*4 - Math.PI) >= epsilon) {
			if (cc % 2 == 0) {
				calc += 1.0/cc2;
			} else {
				calc -= 1.0/cc2; 
			}
			cc2 += 2;
			cc++;
		}
		
		return String.format("[%d, %.10f]", cc, calc*4);
	}
	
	public static void main(String[] args) {
		
		System.out.println(iterPi2String(0.1));
		
	}
}
