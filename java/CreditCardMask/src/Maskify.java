
public class Maskify {

	public static String maskify(String str) {
		
		char[] c = str.toCharArray();
		
		for (int i = 0; i<(str.length()-4); i++) {
			c[i] = '#';
		}
		
		return str.valueOf(c);
	}
	
	public static void main(String[] args) {
		
		String res = maskify("4556364607935616");
		System.out.println(res);
		
	}
}
