package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

public class Task1 {

	// В массив А[N] занесены натуральные числа Найти сумму тех элементов, которые
	// кратны заданному К.

	public static void main(String[] args) {
		int array[];
		int n;
		int k;
		int summ;

		summ = 0;

		System.out.println("Введите количество элементов массива");
		n = console();

		System.out.println("Введите делитель k");
		k = console();

		array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 10);
		
			System.out.println("a" + i + " = " + array[i]);
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				summ += array[i];
			}
		}
		System.out.println("summ = " + summ);
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
