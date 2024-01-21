import java.util.ArrayList;
import java.util.List;

public class Kata {

	public static List<Object> filterList(final List<Object> list) {
		
		ArrayList<Object> eae = new ArrayList<Object>(list);
		
		for (int i = 0; i < eae.size(); i++) {
			String aux = eae.get(i).toString();
			if (eae.get(i).equals(aux)) {
				eae.remove(i);
				i--;
			}
		}
		
		return eae;
	}
	
	public static void main(String[] args) {
		
		List<Object> teste = List.of(1, 2, "a", "b", "aasf", "1", "123", 231);
		List<Object> teste2 = filterList(teste);

		for (Object i: teste2) {
			System.out.println(i);
		}
	}
}
