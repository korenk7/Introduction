package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task14 {
	// сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в
	// каждом слобце
	// число единиц равно номеру столбца
	public static void main(String[] args) {
		int[][] array;
		int numOfLines;
		int numOfColumns;

		System.out.println("give me numOfLines");
		numOfLines = console();
		System.out.println("give me numOfColumns");
		numOfColumns = console();

		array = new int[numOfLines][numOfColumns];


		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {

				if (i < numOfLines && i <= j) {
					for (int h = i; h >= 0; h--) {
						array[h][j] = 1;
					}
				}
			}
		}

		printArray(array);
		System.out.println();

	}

	public static int console() {

		String str;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}
		return sc.nextInt();
	}

	public static void printArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
