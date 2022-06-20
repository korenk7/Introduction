package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task1 {
	// Дана матрица. Вывести на экран все нечетные столбцы у которых
	// первый элемент больше последнего
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
				array[i][j] = (int) (Math.random() * 100 - 50);
			}
		}

		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				if (j == 0 || j % 2 == 0) {
					if (array[0][j] > array[numOfLines - 1][j]) {
						System.out.print(array[i][j] + " ");
					}
				}
			}
			System.out.println();

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
