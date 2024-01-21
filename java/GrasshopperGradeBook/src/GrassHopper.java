
public class GrassHopper {

	public static char getGrade(int s1, int s2, int s3) {
		
		int ans = (s1 + s2 + s3) / 3;
		
		if (ans >= 0 && ans < 60) {
			return 'F';
		} else if (ans >= 60 && ans < 70) {
			return 'D';		
		} else if (ans >= 70 && ans < 80) {
			return 'C';		
		} else if (ans >= 80 && ans < 90) {
			return 'B';		
		} else {
			return 'A';
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(getGrade(70, 70, 100));
		
	}
}
