package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

public class Task3 {

	// Дан массив действительных чисел, размерность которого N.
	// Подсчитать сколько в нём отрицательных, положительных и нулевых элементов.

	public static void main(String[] args) {
		int array[];
		int n;
		int countofnegative;
		int countofpositive;
		int countofzero;

		System.out.println("Введите количество элементов массива");
		n = console();

		array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100 - 50);

			System.out.println("a" + i + " = " + array[i] + " ");
		}

		countofnegative = 0;
		countofpositive = 0;
		countofzero = 0;

		for (int i = 0; i < n; i++) {
			if (array[i] < 0) {
				countofnegative++;
			} else if (array[i] > 0) {
				countofpositive++;
			} else {
				countofzero++;
			}
		}
		System.out.println("Count of positive " + countofpositive);
		System.out.println("Count of negative " + countofnegative);
		System.out.println("Count of zero " + countofzero);
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
