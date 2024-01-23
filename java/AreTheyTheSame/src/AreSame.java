import java.util.Arrays;

public class AreSame {

	public static boolean comp(int[] a, int[] b) {

		if ((a == null || b == null) || (a.length != b.length)) {
			return false;
		} else {

			for (int i = 0; i < a.length; i++) {
				a[i] = Math.abs(a[i]);
			}
			for (int j = 0; j < b.length; j++) {
				b[j] = Math.abs(b[j]);
			}

			Arrays.sort(a);
			Arrays.sort(b);

			for (int k = 0; k < a.length; k++) {
				if (a[k] * a[k] != b[k]) return false;
			}

			return true;
		}
	}

	public static void main(String[] args) {

		int[] a = new int[] {};
		int[] b = new int[] {};
		System.out.println(comp(a, b));

	}
}
