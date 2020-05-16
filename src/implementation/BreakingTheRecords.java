package implementation;

import java.io.IOException;

public class BreakingTheRecords {

	public static int[] breakingRecords(int[] scores) {
		int[] result = {0, 0};
		int minValue, maxValue;
		minValue = maxValue = scores[0];
		for(int i = 1; i < scores.length; i++) {
			if(scores[i] < minValue) {
				minValue = scores[i];
				++result[1];
			} else if( scores[i] > maxValue) {
				maxValue = scores[i];
				++result[0];
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		String sampleInput = "10 5 20 20 4 5 2 25 1";
		int n = 9;
		int[] scores = new int[n];

		String[] scoresItems = sampleInput.split(" ");

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int[] result = breakingRecords(scores);

		for (int i = 0; i < result.length; i++) {
			System.out.println("Result[" + i + "]:" + result[i]);
		}
	}

}
