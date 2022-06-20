package by.javacourse.module2.sort;

import java.util.Arrays;
import java.util.Scanner;

// Сортировка Шелла. сравниваются 2 соседних элемента.
// Если следующий больше, продвигаются вперед, если меньше, меняют местами и передвигаются назад

public class Task6 {

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

		boolean sorted = false;
		int temp;

		while (sorted == false) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					sorted = false;
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					i = 0;
				}
			}
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
