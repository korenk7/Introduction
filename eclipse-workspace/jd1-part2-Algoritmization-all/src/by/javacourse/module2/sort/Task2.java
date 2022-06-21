package by.javacourse.module2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	// Даны 2 последовательности а1<a2<a3 и b1<b2<b3.
	// образовать из них новую последовательность так чтобы она тоже была
	// неубывающей.

	public static void main(String[] args) {
		double array1[];
		double array2[];
		double coupleArray[];

		int n1;
		int n2;

		System.out.println("Введите количество элементов первого массива n1");
		n1 = console();

		System.out.println("Введите количество элементов первого массива n2");
		n2 = console();

		array1 = new double[n1];
		array2 = new double[n2];
		coupleArray = new double[n1 + n2];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = Math.random() * 10;
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = Math.random() * 10;
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		sorting(array1);
		sorting(array2);

		System.out.println("AFTER SORTING");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		for (int i = 0; i < array1.length; i++) {
			coupleArray[i] = array1[i];
		}
		for (int i = array1.length; i < coupleArray.length; i++) {
			coupleArray[i] = array2[i - array1.length];
		}

		sorting(coupleArray);

		System.out.println(Arrays.toString(coupleArray));
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

	public static void sorting(double[] array) {
		double temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}

}
