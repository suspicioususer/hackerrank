package problem_solving.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {

	public static int migratoryBirds(List<Integer> arr) {
		int maxFrequency = -1;
		int result = Integer.MAX_VALUE;
		HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		frequencyMap.put(1, 0);
		frequencyMap.put(2, 0);
		frequencyMap.put(3, 0);
		frequencyMap.put(4, 0);
		frequencyMap.put(5, 0);
		for (Integer i : arr) {
			int temp = frequencyMap.get(i);
			frequencyMap.replace(i, ++temp);
		}

		for (int i = frequencyMap.size(); i >= 1; i--) {
			int temp = frequencyMap.get(i);
			if (temp >= maxFrequency) {
				maxFrequency = temp;
				if (i < result) {
					result = i;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Integer array[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4 };
		List<Integer> arr = Arrays.asList(array);

		int result = migratoryBirds(arr);
		System.out.println("Result:" + result);
	}

}
