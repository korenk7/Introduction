package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

public class Task7 {
	// дана последовательность чисел а1, а2, а3....а2n. Найти
	// max(a1+a2n,a2+a2n-1,... an+an+1)

	public static void main(String[] args) {
		int array[];
		int n;
		int max;
		int sum;

		System.out.println("Введите количество элементов массива");
		n = console();

		array = new int[2 * n];

		sum = 0;
		for (int i = 0; i < 2 * n; i++) {

			array[i] = (int) (Math.random() * 100 - 50);
			System.out.println("a" + i + " = " + array[i] + " ");

		}
		max = array[0] + array[2 * n - 1];

		for (int i = 0; i <= n; i++) {
			sum = array[i] + array[2 * n - 1 - i];
			if (sum > max) {
				max = sum;
			}
		}

		System.out.println("max of a1+a2n,a2+a2n-1,... an+an+1 is " + max);
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
