package by.javacourse.module2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
	// Задан массив D. Определить следующие суммы (D[1]+D[2]+D[3]; D[2]+D[3]+D[4]...
	// Составить метод(ы) для для вычисления суммы трех последовательно
	// расположенных элементов с номерами от k до m

	public static void main(String[] args) {

		double array[];
		int n1;

		System.out.println("Введите количество элементов  массива n");
		n1 = countChecking();
		array = new double[n1];

		array = arrayFilling(array);
		System.out.println(Arrays.toString(array));

		sumOf3ElementFinding(array);

	}

	public static int countChecking() {

		String str;
		int naturalValue;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}

		naturalValue = sc.nextInt();

		if (naturalValue == 1 || naturalValue == 2) {
			System.out.println("try one more time, can't work with this count of values");
			naturalValue = countChecking();

		}

		if (naturalValue <= 0) {
			System.out.println("try one more time, num must me > 0");
			naturalValue = countChecking();

		}

		return naturalValue;
	}

	public static double[] arrayFilling(double[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (double) ((int) (Math.random() * 10000 - 5000)) / 100;
		}

		return array;

	}

	public static void sumOf3ElementFinding(double[] array) {
		double sum;

		for (int i = 0; i < array.length - 2; i++) {
			sum = array[i] + array[i + 1] + array[i + 2];

			System.out.println("Сумма значений массива [" + (array[i]) + "]+[" + (array[i + 1]) + "]+[" + (array[i + 2])
					+ "] = " + sum);
		}

	}
}
