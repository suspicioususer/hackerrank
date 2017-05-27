package warmup;
import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dimension = scanner.nextInt();
		int[][] matrix = null;
		int diagonalValues1 = 0;
		int diagonalValues2 = 0;

		if (dimension > 0) {
			matrix = new int[dimension][dimension];
		}

		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				int temp = scanner.nextInt();
				if (temp >= -100 && temp <= 100) {
					matrix[i][j] = temp;
				}
			}
		}

		for (int i = 0; i < dimension; i++) {
			int temp = dimension - 1;
			diagonalValues1 += matrix[i][i];
			diagonalValues2 += matrix[i][temp - i];
		}

		System.out.println(Math.abs(diagonalValues1 - diagonalValues2));
		scanner.close();
	}

}
