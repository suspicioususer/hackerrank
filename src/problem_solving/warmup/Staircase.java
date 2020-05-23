package problem_solving.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = size - 1 - (i + 1); j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i + 1); j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		scanner.close();
	}

}
