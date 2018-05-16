import java.lang.Math;

public class PrimeFactor {
	public static void main(String[] args) {
		long n = 600851475143L;
		factor(n);
	}

	public static void factor(long n) {
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}
		for (long i = 3; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		if (n > 2)
			System.out.println(n);
	}
}
