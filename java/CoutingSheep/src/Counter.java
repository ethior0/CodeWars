
public class Counter {

	public static int countSheeps(Boolean[] arrayOfSheeps) {
		
		int cc = 0;
		
		for (int i = 0; i < arrayOfSheeps.length; i++) {
			if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
				cc++;
			}
		}
		
		return cc;
	}
}
