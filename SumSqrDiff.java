//***********
//This application finds the difference between the sum of squares
//and the square of sum from 1-100
//************
public class SumSqrDiff {
	public static void main(String[] args) {
		int[] SumSqr = new int[100];
		int[] SqrSum = new int[100];
		
		int sum1 = 0;
		int sum2 = 0;
		int SqrSum1 = 0;
		
		
		for(int i = 0; i < SumSqr.length; i++) {
			int x = i + 1;
			SumSqr[i] = (int) Math.pow(x, 2);
			sum1 = SumSqr[i] + sum1;
		}
		
		for (int n = 0; n < SqrSum.length; n++) {
			SqrSum[n] = n + 1;
			sum2 = SqrSum[n] + sum2;
			SqrSum1 = (int) Math.pow(sum2, 2);
		}
		
		int diff = SqrSum1 - sum1;
		System.out.println(diff);
	}

}
