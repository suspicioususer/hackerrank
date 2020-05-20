package implementation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DayOfTheProgrammer {

	public static String dayOfProgrammer(int year) {
		String result = "";
		int daysPassed = 0;
		for (int i = 1; i <= 12; i++) {
			int dayCount = 0;
			switch (i) {
			case 4:
			case 6:
			case 9:
			case 11:
				dayCount = 30;
				break;
			case 2:
				if (year < 1918) {
					dayCount = 28;
					if (year % 4 == 0) {
						dayCount = 29;
					}
				} else if (year == 1918) {
					dayCount = 15;
				} else {
					dayCount = 28;
					if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
						dayCount = 29;
					}
				}
				break;
			default:
				dayCount = 31;
				break;
			}

			daysPassed += dayCount;
			if (daysPassed > 256) {
				String month = i < 10 ? "0" + i : String.valueOf(i);
				result += (dayCount - (daysPassed - 256)) + "." + month + "." + year;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> years = Stream.of(1800, 1984, 2016, 2017).collect(Collectors.toList());
		for (Integer year : years) {
			String result = dayOfProgrammer(year);
			System.out.println("Result:" + result);
		}
	}
}
