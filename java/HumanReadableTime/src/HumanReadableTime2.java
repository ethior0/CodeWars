
public class HumanReadableTime2 {

	public static String makeReadable(int seconds) {
		
		int ss = seconds % 60;
		int mm = seconds / 60 % 60;
		int hh = seconds / 3600;
		
		return String.format("%02d:%02d:%02d", hh, mm, ss);
	}
}
