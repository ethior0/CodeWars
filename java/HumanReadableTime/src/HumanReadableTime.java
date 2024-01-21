
public class HumanReadableTime {

	public static String makeReadable(int seconds) {
		
		int hh = 0, mm = 0, ss = seconds;
		String sentence = "", hhS = "", mmS = "", ssS = "";
		
		//calc
		while (ss > 59) {
			ss -= 60;
			mm++;
			if (mm >= 60) {
				hh++;
				mm -= 60;
			}
		}
		
		//output
		if (hh < 10) hhS = "0"+Integer.toString(hh);
		else hhS = Integer.toString(hh);
		if (mm < 10) mmS = "0"+Integer.toString(mm);
		else mmS = Integer.toString(mm);
		if (ss < 10) ssS = "0"+Integer.toString(ss);
		else ssS = Integer.toString(ss);
		
		sentence += hhS + ":" + mmS + ":" + ssS;
		
		return sentence;
	}
}
