import java.util.Arrays;
import java.util.List;

public class MixedSum {

	public static int sum(List<?> mixed) {
	
		int sum = 0;
		
		for (int i = 0; i < mixed.size(); i++) {
			sum += Integer.valueOf( mixed.get(i).toString() );
		}
		
		return sum;
//		return mixed.stream().mapToInt( o -> Integer.valueOf( o.toString() ) ).sum();
	}
	 
	public static void main(String[] args) {
		
		List<?> lista = Arrays.asList(9, 3, "7", "3");
	
		System.out.println(sum(lista));
	}
}
