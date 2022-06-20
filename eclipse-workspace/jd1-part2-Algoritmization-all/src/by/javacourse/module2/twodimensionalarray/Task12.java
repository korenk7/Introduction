package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task12 {
	// отсортировать строки матрицы по возрастанию и убыванию значений элементов
	public static void main(String[] args) {
		int[][] array;
		int numOfLines;
		int numOfColumns;
		int temp;

		System.out.println("give me numOfLines");
		numOfLines = console();
		System.out.println("give me numOfColumns");
		numOfColumns = console();

		array = new int[numOfLines][numOfColumns];

		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				array[i][j] = (int) (Math.random() * 100 - 50);
			}
		}

		printArray(array);
		System.out.println();

		temp = 0;

		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				for (int k = 0; k < numOfColumns - 1; k++) {
					if (array[i][k] > array[i][k + 1]) {
						temp = array[i][k + 1];
						array[i][k + 1] = array[i][k];
						array[i][k] = temp;
					}
				}
			}
		}

		printArray(array);
		System.out.println();

		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				for (int k = 0; k < numOfColumns - 1; k++) {
					if (array[i][k] < array[i][k + 1]) {
						temp = array[i][k + 1];
						array[i][k + 1] = array[i][k];
						array[i][k] = temp;
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
