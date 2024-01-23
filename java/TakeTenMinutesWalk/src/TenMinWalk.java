
public class TenMinWalk {

	public static boolean isValid(char[] walk) {
		
		int ccN = 0, ccS = 0, ccW = 0, ccE = 0;
		
		if (walk.length == 10) {
			
			for (int i = 0;i<walk.length;i++){
	            if(walk[i] == 'n')ccN++;
	            else if(walk[i] == 's') ccS++;
	            else if(walk[i] == 'w') ccW++;
	            else if(walk[i] == 'e') ccE++;
	        }
			
			if (ccN == ccS && ccW == ccE) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
}
