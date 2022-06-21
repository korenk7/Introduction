package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

public class Task9 {
	// В массиве целых чисел с количеством элементов n найти наиболее часто
	// встречающееся
	// число. Если таких чисел несколько, определить меньшее из них

	public static void main(String[] args) {
		int array[];
		int n;
		int countOfCopies;
		int maxCountOfCopies;
		int min;
		int mostOften;

		System.out.println("Введите количество элементов массива");
		n = console();
		array = new int[n];

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 10);
			System.out.println("a" + i + " = " + array[i] + " ");

		}

		countOfCopies = 1;
		maxCountOfCopies = 1;
		min = array[0];
		mostOften = array[0];

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {
					countOfCopies++;
				}

				if (countOfCopies >= maxCountOfCopies) {
					maxCountOfCopies = countOfCopies;
					mostOften = array[i];

					if (mostOften < min) {
						min = mostOften;
					} else {
						min = array[i];
					}
				}
			}
			countOfCopies = 1;
		}
		if (maxCountOfCopies == 1) {
			System.out.println("There is no copyes in this array");
		} else {
			System.out.println("mostOften of this array is " + mostOften);
			System.out.println("min of mostOften of this array is " + min);
			System.out.println("count of copyes is  " + maxCountOfCopies);

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
