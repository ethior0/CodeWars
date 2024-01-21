import java.util.Arrays;

public class SmallestIntegerFinder2 {
	
	public static int findSmallestInt(int[] args) {
		
		Arrays.sort(args);
		
		return args[0];
	}
}

