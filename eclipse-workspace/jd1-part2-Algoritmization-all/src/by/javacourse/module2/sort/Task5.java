package by.javacourse.module2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
	// Сортировка вставками
	// Дана последовательность чисел
	// требуется переставить числа в порядке возрастания
	// Берется число а(i+1) и вставляется в последовательность так, чтобы новая
	// последовательность
	// тоже была возрастающей. Место помещения в отсортированную часть производить
	// отдельной функцией двоичного поиска
	public static void main(String[] args) {

		int array[];
		int n1;

		System.out.println("Введите количество элементов первого массива n1");
		n1 = console();

		array = new int[n1];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (value < array[j]) {
					array[j + 1] = array[j];
				} else {
					break;
				}
			}
			array[j + 1] = value;
		}
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

}
