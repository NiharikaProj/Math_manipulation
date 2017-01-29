
public class Factor {

	public static void main(String[] args) {
		int n = 6, i = 0;
		System.out.println("factor of: " + n);
		System.out.println("1");
		for (i = 2; i < n; i++) {
			if (n % i == 0)
				System.out.println(i);
		}

		System.out.println(n);
	}

}