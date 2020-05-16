package implementation;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
	
	public static int birthday(List<Integer> s, int d, int m) {
		int result = 0;
		int end = s.size() - m;
		
		for(int i = 0; i <= end; i++) {
			List<Integer> subList = s.subList(i, m + i);
			int subListSum = subList.stream().mapToInt(x -> x.intValue()).sum();
			if(subListSum == d) {
				++result;
			}
		}
		return result;
    }

    public static void main(String[] args) throws IOException {
    	
    	List<Integer> s = Arrays.asList(new Integer[] {1, 2, 1 ,3, 2});
    	int d = 3;
    	int m = 2;
    	
        int result = birthday(s, d, m);

        System.out.println("Result: " + result);
    }

}
