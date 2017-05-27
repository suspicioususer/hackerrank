package warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] integerValues = null;
		int zero = 0;
		int negative = 0;
		int positive = 0;
		int size = scanner.nextInt();
		scanner.nextLine();
		String values = scanner.nextLine();

		if (size > 0) {
			integerValues = new int[size];
		}

		String[] valuesArray = values.split("\\s+");

		for (int i = 0; i < size; i++) {
			integerValues[i] = Integer.parseInt(valuesArray[i]);
			if (integerValues[i] == 0) {
				zero++;
			} else if (integerValues[i] < 0) {
				negative++;
			} else {
				positive++;
			}
		}

		System.out.println((double) positive / size);
		System.out.println((double) negative / size);
		System.out.println((double) zero / size);
		scanner.close();

	}

}
