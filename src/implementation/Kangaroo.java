package implementation;

import java.util.Scanner;

public class Kangaroo {

	private static String kangaroo(int[] values) {
		int kangaroo1TotalDistance = values[0];
		int kangaroo2TotalDistance = values[2];

		if ((values[2] > values[0]) && (values[3] > values[1])) {
			return "NO";
		} else if ((values[0] > values[2]) && (values[1] > values[3])) {
			return "NO";
		} else {
			while (true) {
				System.out.println(kangaroo1TotalDistance + "-" + kangaroo2TotalDistance);
				if (kangaroo1TotalDistance == kangaroo2TotalDistance) {
					return "YES";
				} else if (kangaroo1TotalDistance >= 20000000 || kangaroo2TotalDistance >= 20000000) {
					return "NO";
				}
				kangaroo1TotalDistance += values[1];
				kangaroo2TotalDistance += values[3];
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] values = new int[4];

		for (int i = 0; i < 4; i++) {
			int temp = scanner.nextInt();
			switch (i) {
			case 0:
				if (temp >= 0 && temp <= 10000) {
					values[i] = temp;
				} else {
					i--;
				}
				break;
			case 1:
				if (temp >= 1 && temp <= 10000) {
					values[i] = temp;
				} else {
					i--;
				}
				break;
			case 2:
				if (temp >= 0 && temp <= 10000 && temp > values[0]) {
					values[i] = temp;
				} else {
					i--;
				}
				break;
			case 3:
				if (temp >= 1 && temp <= 10000) {
					values[i] = temp;
				} else {
					i--;
				}
				break;

			default:
				break;
			}
		}

		String result = kangaroo(values);

		System.out.println(result);
		scanner.close();
	}

}
