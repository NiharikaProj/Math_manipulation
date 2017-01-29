
public class PrimeFactor {

	public static void main(String[] args) {
		int n = 1700, i = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				prime(i);
		}

	}

	private static void prime(int n) {
		int m = (int) Math.sqrt(n);
		int count = 0;

		for (int i = 2; i <= m; i++) {
			if (n % i == 0)
				++count;
		}

		if (count == 0) {
			System.out.println(n);
		}
	}

}
