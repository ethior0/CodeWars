
public class PiApprox {

	public static String iterPi2String(Double epsilon) {
		
		int cc = 1;
		int cc2 = 0;
		double calc = 4, num = 3, res = 0;
		
		for (;;) {
			if (cc2 == 0) {
				calc = calc - (1/num) * 4;
				cc2--;
			} else {
				calc = calc + (1/num) * 4;
				cc2++;
			}
			num += 2;
			cc++;
			
			res = Math.abs(calc - Math.PI);
			if (res < epsilon) {
				break;
			}
		}
		
		return String.format("[%d, %.10f]", cc, calc);
	}
	
	public static void main(String[] args) {
		
		System.out.println(iterPi2String(0.1));
		
	}
}
