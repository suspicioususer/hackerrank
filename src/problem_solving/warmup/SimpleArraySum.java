package problem_solving.warmup;

import java.util.Scanner;

public class SimpleArraySum {
	
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		int[] test = new int[size];
		for (int i = 0; i < size; i++) {
			test[i] = scanner.nextInt();
		}
		int temp = 0;
		for (int i : test) {
			temp += i;
		}
		System.out.println(temp);
		scanner.close();
	}
}
