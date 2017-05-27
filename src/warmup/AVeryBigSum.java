package warmup;
import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long[] values = null;
		long sum = 0;
		int size = 0;

		while (size < 1 || size > 10) {
			size = scanner.nextInt();
		}

		values = new long[size];

		for (int i = 0; i < size; i++) {
			int temp = scanner.nextInt();
			if (temp >= 0 && temp <= Math.pow(10, 10)) {
				values[i] = (long) temp;
				sum += values[i];
			} else {
				i -= 1;
			}

		}

		System.out.println(sum);
		scanner.close();

	}

}
