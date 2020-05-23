package problem_solving.implementation;

public class DivisibleSumPairs {

	public static int divisibleSumPairs(int n, int k, int[] ar) {
		int result = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if ((ar[i] + ar[j]) % k == 0) {
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 6;
		int k = 3;

		int[] ar = { 1, 3, 2, 6, 1, 2 };

		int result = divisibleSumPairs(n, k, ar);
		System.out.println("Result:" + result);
	}

}
