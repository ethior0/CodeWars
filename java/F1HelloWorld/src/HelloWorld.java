
public class HelloWorld {

	public static String greet() {

		String greet = "";
		int cc = 0;
		
		for (int j = 0; j < 5; j++) {
			for (char l = 'a'; l <= 'z'; l++) {
				
				if (l == 'h' && cc == 0) {
					greet += l;
					cc++;
				} else if (l == 'e' && cc == 1) {
					greet += l;
					cc++;
				} else if (l == 'l' && cc == 2) {
					greet = greet + l + l;
					cc++;
				} else if (l == 'o' && cc == 3) {
					greet += l + " ";
					cc++;
				} else if (l == 'w' && cc == 4) {
					greet = greet + l + "o";
					cc++;
				} else if (l == 'r' && cc == 5) {
					greet += l;
					cc++;
				} else if (l == 'l' && cc == 6) {
					greet += l;
					cc++;
				} else if (l == 'd' && cc == 7) {
					greet += l + "!";
					cc++;
				}
			}
		}
		
		return greet;
	}
	
	public static void main(String[] args) {
		
		System.out.println(greet());
		
	}
}
