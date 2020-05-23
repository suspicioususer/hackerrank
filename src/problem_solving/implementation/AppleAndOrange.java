package problem_solving.implementation;

import java.util.HashMap;
import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Character, Integer> values = new HashMap<Character, Integer>();
		int[] apples;
		int[] oranges;
		int tempCounter = 0;
		
		for (int i = 0; i < 6; i++) {
			int temp = 0;
			temp = scanner.nextInt();
			if (temp >= 1 && temp <= Math.pow(10, 5)) {
				switch (i) {
				case 0:
					values.put('s', temp);
					break;
				case 1:
					if (temp > values.get('s')) {
						values.put('t', temp);
					} else {
						i--;
					}
					break;
				case 2:
					if (temp < values.get('s') && temp < values.get('t')) {
						values.put('a', temp);
					} else {
						i--;
					}
					break;
				case 3:
					if (temp > values.get('s') && temp > values.get('t') && temp > values.get('a')) {
						values.put('b', temp);
					} else {
						i--;
					}
					break;
				case 4:
					values.put('m', temp);
					break;
				case 5:
					values.put('n', temp);
					break;

				default:
					break;
				}
			} else {
				i--;
			}
		}

		apples = new int[values.get('m')];
		for (int i = 0; i < values.get('m'); i++) {
			int temp = scanner.nextInt();
			if (temp >= -Math.pow(10, 5) && temp <= Math.pow(10, 5)) {
				apples[i] = temp;
			} else {
				i--;
			}
		}

		oranges = new int[values.get('n')];
		for (int i = 0; i < values.get('n'); i++) {
			int temp = scanner.nextInt();
			if (temp >= -Math.pow(10, 5) && temp <= Math.pow(10, 5)) {
				oranges[i] = temp;
			} else {
				i--;
			}
		}

		for (int i = 0; i < apples.length; i++) {
			int temp = values.get('a') + apples[i];
			if (temp >= values.get('s') && temp <= values.get('t')) {
				tempCounter++;
			}
		}
		
		System.out.println(tempCounter);
		tempCounter = 0;
		
		for (int i = 0; i < oranges.length; i++) {
			int temp = values.get('b') + oranges[i];
			if (temp >= values.get('s') && temp <= values.get('t')) {
				tempCounter++;
			}
		}

		System.out.println(tempCounter);
		scanner.close();
	}

}
