
public class Order {

	public static String order(String words) {
			
			String[] w = words.split(" ");
			String[] sentence = new String[w.length];
			
			for (int i = 0; i < w.length; i++) {
				for (int j = 0; j < w.length; j++) {
					if (w[j].contains(String.valueOf(i+1))) {
						sentence[i] = w[j];
					}
				}
			}
			
			return (words.contains("1")) ? String.join(" ", sentence) : "";
	}
	
	public static void main(String[] args) {
		
		System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
		
	}
}
