package problem_solving.implementation;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

	public static int getTotalX(int[] a, int[] b) {
		List<Integer> resultList = new ArrayList<Integer>();
		int factor1 = lcm(a);
		int factor2 = gcd(b);
		for (int i = factor1; i <= factor2; i += factor1) {
			int temp = 0;
			for (int j = 0; j < b.length; j++) {
				if (b[j] % i == 0) {
					temp++;
				}
			}
			if (temp == b.length) {
				resultList.add(temp);
			}
		}
		return resultList.size();
	}

	public static int gcd(int[] array) {
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			result = gcd(result, array[i]);
		}
		return result;

	}

	public static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int lcm(int[] array) {
		int result = array[0];
		for (int i = 0; i < array.length; i++) {
			result = lcm(result, array[i]);
		}
		return result;
	}

	public static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

	public static void main(String[] args) {
		int[] a = { 2, 4 };
		int[] b = { 16, 32, 96 };

		int total = getTotalX(a, b);
		System.out.println("Total: " + total);
	}

}
