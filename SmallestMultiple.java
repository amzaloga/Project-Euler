//**************************************************
//This app calculates the smallest 
//number that is divisible by the input value and 1.
//***************************************************
import java.util.Scanner;

public class SmallestMultiple {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("What is biggest number you wish to divide by? ");
		int x = scan.nextInt();

		int i = 1;

		for (int n = x; n > 0; --n) {
			if (i % n == 0) {
			} else {
				n = x;
				i++;
			}

		}
		System.out.println(i + " is divisible by " + x + " to 1");
	}

}
