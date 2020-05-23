package problem_solving.warmup;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int values[] = new int[5];
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			int temp = scanner.nextInt();
			if (temp >= 1 && temp <= Math.pow(10, 9)) {
				values[i] = temp;
			}
		}

		for (int i = 0; i < 5; i++) {
			long temp = 0;
			for (int j = 0; j < 5; j++) {
				if (j != i) {
					temp += (long) values[j];
				}
			}
			
			min = Math.min(min, temp);
			max = Math.max(max, temp);

		}

		System.out.println(min + " " + max);
		scanner.close();

	}

}
