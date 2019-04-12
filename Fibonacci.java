//****************************************************************
//This returns the sum of the series of fibbonacci's sequence. 
//The 32nd occurance happens to be under 4,000,000 ALeks Zaloga
//*****************************************************************
public class Fibonacci {
	public static void main(String[] args) {
		int[] fibbo = new int[32];
		int sum = 0;

		for (int i = 0; i < fibbo.length; i++) {
			fibbo[i] = fib(i);
			if (fibbo[i] % 2 == 0) {
				sum = sum + fibbo[i];
			}	
		}
		

		for (int array : fibbo) {
			System.out.print(array + " ");
		}
		System.out.println("\nSum: " + sum);
	}

	public static int fib(int i) {
		if (i < 1) {
			return 1;
		}
		return fib(i - 1) + fib(i - 2);
	}
}
