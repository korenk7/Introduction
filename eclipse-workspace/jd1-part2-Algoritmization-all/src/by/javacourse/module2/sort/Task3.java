package by.javacourse.module2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
	// Сортировка выбором
	// Дана последовательность чисел a1<a2<...<an.
	// Требуется переместить элементы так, чтобы они были расположены по убыванию.
	// Для этого
	// в массиве, начиная с первого, выбирается наибольший элемент и ставится на
	// первое место,
	// а первый - на место наибольшего. Затем начиая со второго, эта процедура
	// повторяется

	public static void main(String[] args) {
		double array[];
		int n1;
		double max;
		int indexOfMax;
		double temp;

		System.out.println("Введите количество элементов первого массива n1");
		n1 = console();

		array = new double[n1];

		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
		}

		System.out.println(Arrays.toString(array));

		sorting(array);

		max = array[0];
		indexOfMax = 0;
		System.out.println("AFTER SORTING");
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] > max) {
					max = array[j];
					indexOfMax = j;
				}
			}
			temp = array[i];
			array[i] = max;
			array[indexOfMax] = temp;
			max = array[array.length - 1];

		}
		System.out.println("AFTER SORTING");
		System.out.println(Arrays.toString(array));

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
