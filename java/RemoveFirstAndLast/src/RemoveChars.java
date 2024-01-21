
public class RemoveChars {

	public static String remove(String str) {
		
		StringBuilder teste = new StringBuilder(str);
		
		teste = teste.deleteCharAt(0);
		teste = teste.deleteCharAt(teste.length()-1);
		
		return teste.toString();
		 
	}
	
	public static void main(String[] args) {
		
		String res = remove("Alessandro");
		System.out.println(res);
		
	}
}
