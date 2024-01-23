
public class Kata {

	public static boolean validPhoneNumber( String phoneNumber ) {
		
		String phoneForm = "(000) 000-0000";
		phoneNumber = phoneNumber.replaceAll("[0-9]", "0");
		
		return phoneForm.equals(phoneNumber);
	}
	
	public static void main( String[] args ) {
		
		System.out.println( validPhoneNumber("(098) 123 4567") );
	}
}
