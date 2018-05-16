public class Multi35 {
	public static void main(String[] args) {
		int sum = 0;
		int[] multi = new int[1000];

		for (int i = 0; i < multi.length; i++) {
			if (i % 3 == 0 || i % 5 ==0) {
				multi[i] = i;
				sum = sum + i;
			}
			
		}

		for (int array : multi) {
			System.out.print(array + " ");
		}
		System.out.println("\nThe sum is: " + sum);

	}
}