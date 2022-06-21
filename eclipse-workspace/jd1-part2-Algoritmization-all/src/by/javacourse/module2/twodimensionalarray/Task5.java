package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task5 {
	// Сформировать матрицу порядка N по заданному образцу(n-четное)
	// ( 1 1 1 ... 1 1 1)
	// ( 2 2 2 ... 2 2 0)
	// ( 3 3 3 ... 3 0 0)
	// ( n 0 0 ... 0 0 0)
	public static void main(String[] args) {
		int[][] array;
		int numOfelements;
		int numOfcolumns;

		System.out.println("give me numOfLines");
		numOfelements = console();

		array = new int[numOfelements][numOfelements];
		numOfcolumns = numOfelements;

		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfcolumns; j++) {

				array[i][j] = i + 1;
			}
			numOfcolumns--;
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
