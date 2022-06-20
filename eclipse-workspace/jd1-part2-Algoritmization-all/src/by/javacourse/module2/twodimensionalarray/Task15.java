package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task15 {
	// найдите наибольший элемент матрицы и замените все нечетные элементы на него

	public static void main(String[] args) {
		int[][] array;
		int numOfLines;
		int numOfColumns;
		int max;

		System.out.println("give me numOfLines");
		numOfLines = console();
		System.out.println("give me numOfColumns");
		numOfColumns = console();

		array = new int[numOfLines][numOfColumns];
		max = array[0][0];

		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				array[i][j] = (int) (Math.random() * 100 - 50);
				if (max < array[i][j]) {
					max = array[i][j];
				}

			}
		}

		printArray(array);
		System.out.println("Maximal value is "+max);
		System.out.println();
		

		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				if (array[i][j] % 2 != 0) {
					array[i][j]=max;
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
