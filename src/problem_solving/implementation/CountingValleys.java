package problem_solving.implementation;

public class CountingValleys {

	public static int countingValleys(int n, String s) {
		int level = 0;
		int oldLevel = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			oldLevel = level;
			if (s.charAt(i) == 'U') {
				level -= 1;
			} else {
				level += 1;
			}

			if (oldLevel == 0 && level > 0) {
				result++;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int n = 8;
		String s = "UDDDUDUU";

		int result = countingValleys(n, s);
		System.out.println("Result: " + result);
	}

}
