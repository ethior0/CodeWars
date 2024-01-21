
public class Kata {

	public static String[] towerBuilder(int nFloors) {
		
		String[] tower = new String[nFloors];
		int c = nFloors * 2 - 1, 
			de1 = c/2 - 1, 
			de2 = c/2 + 1;
		
		for (int i = 0; i < tower.length; i++, de1--, de2++) {
			tower[i] = "";
			
			for (int j = 0; j < c; j++) {
				if (j > de1 && j < de2) {
					tower[i] += "*";
				} else {
					tower[i] += " ";
				}
			}
		}
		
		return tower;
	}
}
