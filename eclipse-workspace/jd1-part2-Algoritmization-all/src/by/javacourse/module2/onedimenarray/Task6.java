package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

public class Task6 {

	// задана последовательность N вещественных чисел
	// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

	public static void main(String[] args) {
		int array[];
		int n;
		int summ;

		System.out.println("Введите количество элементов массива");
		n = console();

		array = new int[n];
		summ = 0;

		for (int i = 0; i < n; i++) {

			array[i] = (int) (Math.random() * 100 - 50);
			System.out.println("a" + i + " = " + array[i] + " ");

		}

		for (int i = 3; i < n; i++) {
			if (isSimple(i)) {
				summ += array[i];
			}

		}

		System.out.println("summ of elements with prime indexes = " + (summ + array[1]));

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

	public static boolean isSimple(int arg) {
		int temp;
		boolean isPrime = true;

		for (int i = 2; i < arg; i++) {

			temp = arg % i;
			if (temp == 0) {
				isPrime = false;

			}
		}

		return isPrime;
	}

}
