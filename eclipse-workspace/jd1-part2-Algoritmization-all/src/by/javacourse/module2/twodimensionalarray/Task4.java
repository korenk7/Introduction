package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task4 {
// Сформировать матрицу порядка N по заданному образцу(n-четное)
	// ( 1 2 3 ... n)
	// ( n n-1 n-2 ... 1)
	// ( 1 2 3 ... n)
	// ( n n-1 n-2 ... 1)
	public static void main(String[] args) {
		int[][] array;
		int numOfelements;

		System.out.println("give me numOfLines");
		numOfelements = console();

		array = new int[numOfelements][numOfelements];

		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfelements; j++) {
				if (i == 0 || i % 2 == 0) {
					array[i][j] = j + 1;
				} else {
					array[i][j] = numOfelements - j;
				}
			}
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
