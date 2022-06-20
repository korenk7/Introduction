package by.javacourse.module2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	// Составить программу, которая в массиве А[N] находит второе по величине число
	// (вывести на печать число,
	// которое меньше максимального элемента массива, но больше всех других
	// элементов
	public static void main(String[] args) {

		double array[];
		int n1;

		System.out.println("Введите количество элементов  массива n");
		n1 = countChecking();
		array = new double[n1];

		array = arrayFilling(array);
		System.out.println(Arrays.toString(array));

		secondMaxValue(array);

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

		if (naturalValue == 1) {
			System.out.println("try one more time, can't work with 1 value");
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

	public static void secondMaxValue(double[] array) {
		double maxValue;
		double secondMaxValue;

		maxValue = array[0];
		secondMaxValue = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {

			if (array[i] > secondMaxValue && array[i] < maxValue) {
				secondMaxValue = array[i];
			}
		}

		System.out.println("Max Value of array is " + maxValue);
		System.out.println("Second ofMax Value of array is " + secondMaxValue);

	}

}