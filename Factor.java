
public class Factor {

	public static void main(String[] args) {
		int n = 24, i = 0;
		System.out.println("factor of: " + n);
		System.out.println("1");
		for (i = n / 2; i > 1; i--) {
			if (n % i == 0 && (i>(n/i))) {

				System.out.println(i);
				System.out.println(n / i);

			}

		}

		System.out.println(n);
	}

}