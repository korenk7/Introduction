package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task11 {
	// Матрицу 10х20 заполнить случайными числами от 0 до 15.
	// вывести на экран саму матрицу и номера строк в которых число 5 встречается
	// 3 и более раз

	public static void main(String[] args) {
		int[][] array;
		int numOfLines;
		int numOfColumns;
		int countOfFives;

		numOfLines = 10;
		numOfColumns = 15;

		array = new int[numOfLines][numOfColumns];

		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				array[i][j] = (int) (Math.random() * 16);
			}
		}

		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		countOfFives = 0;
		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				if (array[i][j] == 5) {
					countOfFives++;
				}
			}
			if (countOfFives > 3) {
				System.out.println("in row " + (i + 1) + " count Of fives " + countOfFives);
			}
			countOfFives = 0;
		}

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
