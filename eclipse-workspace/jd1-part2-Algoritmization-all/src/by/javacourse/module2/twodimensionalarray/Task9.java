package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task9 {
	// Задана матрица неотрицательных чисел.
	// Посчитать сумму элементов в каждом столбце.
	// Определить какой столбец имеет большую сумму.

	public static void main(String[] args) {
		int[][] array;
		int numOfRows;
		int numOfcolumns;
		int sumOfElements;
		int maxSumOfElements;

		System.out.println("give me numOfLines");
		numOfRows = console();
		System.out.println("give me numOfColumns");
		numOfcolumns = console();

		array = new int[numOfRows][numOfcolumns];
		sumOfElements = 0;
		maxSumOfElements = 0;
		int j = 0;
		for (int i = 0; i < numOfcolumns; i++) {
			for (j = 0; j < numOfRows; j++) {

				array[j][i] = (int) (Math.random() * 100);
				sumOfElements += array[j][i];

			}
			System.out.println("sumOfElements=" + sumOfElements);
			if (sumOfElements > maxSumOfElements) {
				maxSumOfElements = sumOfElements;

			}
			sumOfElements = 0;
		}

		for (int i = 0; i < numOfRows; i++) {
			for (int k = 0; k < numOfcolumns; k++) {
				System.out.print(array[i][k] + " ");
			}
			System.out.println();
		}

		System.out.println("maxSumOfElements = " + maxSumOfElements);
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

}
