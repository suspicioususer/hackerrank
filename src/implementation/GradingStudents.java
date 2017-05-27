package implementation;

import java.util.Scanner;

public class GradingStudents {

	static void solve(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			int tempGrade = grades[i];
			if (tempGrade < 40 && tempGrade >= 38) {
				tempGrade = 40;
			} else if (tempGrade > 40 && (tempGrade % 5) >= 3) {
				int a = tempGrade / 5;
				a++;
				tempGrade = a * 5;
			}
			System.out.println(tempGrade);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		solve(grades);
		in.close();
	}

}
