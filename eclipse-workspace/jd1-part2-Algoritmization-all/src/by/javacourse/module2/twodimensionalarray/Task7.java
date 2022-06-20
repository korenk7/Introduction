package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task7 {
	// Сформировать квадратную матрицу порядка N по правилу
	// а[i,j]= sin((i^2-j^2)/n)
	// и подсчитать количество положительных элементов в ней

	public static void main(String[] args) {
		double[][] array;
		int numOfelements;
		double sumOfPositive;

		System.out.println("give me numOfLines");
		numOfelements = console();

		array = new double[numOfelements][numOfelements];
		sumOfPositive = 0;

		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfelements; j++) {

				array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / numOfelements);
				if (array[i][j] > 0) {
					sumOfPositive += array[i][j];
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
		System.out.println("Summ of positive elements is " + sumOfPositive);

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