
public class Kata {

	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
		
		int avg = yourPoints;
		for (int values: classPoints) {
			avg += values;
		}
		
		avg = avg / (classPoints.length + 1);
		
		return (yourPoints > avg) ? true : false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(betterThanAverage( new int[] {100, 90}, 11 ) );
		
	}
}
