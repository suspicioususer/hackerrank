package problem_solving.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		int alice = 0, bob = 0;
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[3];
		int[] B = new int[3];

		for (int i = 0; i < 3; i++) {
			A[i] = scanner.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			B[i] = scanner.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			if (A[i] < B[i]) {
				bob++;
			} else if (A[i] > B[i]) {
				alice++;
			}
		}

		System.out.println(alice + " " + bob);
		scanner.close();
	}

}
