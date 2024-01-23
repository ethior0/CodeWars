
public class CodeWars2 {

	public static int strCount( String str, char letter ) {
		
		return (int) str.chars().filter(x -> x == letter).count();
	}
	
	public static void main( String[] args ) {
		
		System.out.println( strCount("Thiagolas, the dog's best friend", 't') );
		
	}
}
