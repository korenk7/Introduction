package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task8 {
	// в числовой матрице поменять местами два любых столбца, т.е. все элементы
	// одного
	// столбца поставить на соответствующие им позиции другого, а его элементы
	// переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

	public static void main(String[] args) {
		int[][] array;
		int numOfRows;
		int numOfcolumns;
		int temp;
		int column1;
		int column2;

		System.out.println("give me numOfLines");
		numOfRows = console();
		System.out.println("give me numOfColumns");
		numOfcolumns = console();

		array = new int[numOfRows][numOfcolumns];

		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfcolumns; j++) {

				array[i][j] = (int) (Math.random() * 100 - 50);
			}
		}

		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfcolumns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("give me first column for replace");
		column1 = columnChecking(numOfcolumns);

		System.out.println("give me second column for replace");
		column2 = columnChecking(numOfcolumns);

		for (int i = 0; i < numOfRows; i++) {
			temp = array[i][column1-1];
			array[i][column1-1] = array[i][column2-1];
			array[i][column2-1] = temp;
		}
		System.out.println();
		System.out.println("New array after replace");
		
		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfcolumns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

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

	public static int columnChecking(int n1) {

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

		while (numForChecking < 0) {
			System.out.println("try one more time, this number must be bigger than 0");
		}

		return numForChecking;

	}

}
