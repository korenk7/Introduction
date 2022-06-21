package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task2 {
	// Дана матрица. Вывести на экран элементы, стоящие на диагонали
	public static void main(String[] args) {
		int[][] array;
		int numOfelements;

		
		System.out.println("give me numOfLines");
		numOfelements = console();
		System.out.println("give me numOfColumns");

		array = new int[numOfelements][numOfelements];

		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfelements; j++) {
				array[i][j] = (int) (Math.random() * 100 - 50);
			}
		}

		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfelements; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfelements; j++) {
				if (i == j) {
					System.out.print(array[i][j] + " ");
				} else {
					System.out.print(" " + " ");
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
