package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task6 {
	// —формировать матрицу пор€дка N по заданному образцу(n-четное)
	// ( 1 1 1 ... 1 1 1)
	// ( 0 1 1 ... 1 1 0)
	// ( 0 0 1 ... 1 0 0)
	// ( 0 1 1 ... 1 1 0)
	// ( 1 1 1 ... 1 1 1)

	public static void main(String[] args) {
		int[][] array;
		int numOfelements;
		int numOfcolumns;
		int columnCorector;

		System.out.println("give me numOfLines");
		numOfelements = console();

		array = new int[numOfelements][numOfelements];
		numOfcolumns = numOfelements;
		columnCorector = 0;

		for (int i = 0; i < numOfelements / 2; i++) {
			for (int j = columnCorector; j < numOfcolumns; j++) {

				array[i][j] = 1;
			}
			columnCorector++;
			numOfcolumns--;
		}

		for (int i = (numOfelements / 2 - 1); i < numOfelements; i++) {
			for (int j = columnCorector; j < numOfcolumns; j++) {

				array[i][j] = 1;
			}
			columnCorector--;
			numOfcolumns++;
		}

		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfelements; j++) {
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

}