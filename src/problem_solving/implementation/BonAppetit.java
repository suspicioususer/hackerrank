package problem_solving.implementation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BonAppetit {

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		int billTotal = bill.stream().mapToInt(x -> x.intValue()).sum();
		bill.remove(k);
		int billExcept = bill.stream().mapToInt(x -> x.intValue()).sum();
		if (billExcept / 2 == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println((billTotal - billExcept) / 2);
		}
	}

	public static void main(String[] args) {
		int k = 1;
		int b = 12;
		List<Integer> bill = Stream.of(3, 10, 2, 9).collect(Collectors.toList());

		bonAppetit(bill, k, b);
	}

}
