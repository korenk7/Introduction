package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task3 {
// Дана матрица. Вывести на экран k-ю строку и p-й столбец матрицы
	public static void main(String[] args) {
		int[][] array;
		int numOfLines;
		int numOfColumns;
		int k;
		int p;

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

		System.out.println("give me k value");
		k = atributeChecking(numOfLines);
		System.out.println("give me p value");
		p = atributeChecking(numOfColumns);

		System.out.println("array" + "[" + (k + 1) + "][" + (p + 1) + "]" + array[k][p]);

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

	public static int atributeChecking(int n1) {

		String str;
		int numForChecking;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}
		
		numForChecking = sc.nextInt();
		
		while (numForChecking > n1) {
			System.out.println("try one more time, this number must be smaller then Num of columns or num of rows");
		}

		return numForChecking;

	}

}
