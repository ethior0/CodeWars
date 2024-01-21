import java.util.Scanner;

public class pangrama {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int cc = 0;
		String sen = ler.nextLine();
		
		for (char c = 'a'; c <= 'z'; c++) {
			for (int j = 0; j < sen.length(); j++) {
				if (sen.charAt(j) == c) {
					cc++;
					break;
				} 
			}
		}
		
		System.out.println(cc >= 23 ? "S" : "N");
		
		ler.close();
	}
}
