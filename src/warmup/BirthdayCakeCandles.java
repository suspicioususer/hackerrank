package warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int candles = 0;
		int[] heights = null;
		int count = 0;
		int maxValue = 0;
		while (!(candles >= 1 && candles <= Math.pow(10, 5))) {
			candles = scanner.nextInt();
		}

		heights = new int[candles];

		for (int i = 0; i < heights.length; i++) {
			int temp = scanner.nextInt();
			if (temp >= 1 && temp <= Math.pow(10, 7)) {
				heights[i] = temp;
			}
		}

		for (int i = 0; i < heights.length; i++) {
			if (heights[i] > maxValue) {
				maxValue = heights[i];
			}
		}
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] == maxValue) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
