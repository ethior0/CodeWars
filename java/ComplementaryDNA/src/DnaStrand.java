
public class DnaStrand {

	public static String makeComplement(String dna) {
		
		char[] c = dna.toCharArray();
		
		for (int i = 0; i < dna.length(); i++) {
			switch(c[i]) {
			case 'A': 
				c[i] = 'T';
				break;
			case 'T':
				c[i] = 'A';
				break;
			case 'G':
				c[i] = 'C';
				break;
			case 'C':
				c[i] = 'G';
				break;
			}
		}
		
		return dna.valueOf(c);
	}
}
