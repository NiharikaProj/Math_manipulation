
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 998, count = 0;
		int m = (int) Math.sqrt(n);

		if (n % 2 == 0) {
			System.out.println(n + " is not a prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0)
					++count;
			}

			if (count == 0) {
				System.out.println(n + " is a prime number");
			} else {
				System.out.println(n + " is not a prime number");
			}
		}

	}
}
