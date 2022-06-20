package by.javacourse.module2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
	// Даны натуральные K и N. Написать метод(ы)формирования массива А, элементами
	// которого являются числа, сумма цифр
	// которых равна K и которые не больше N;
	public static void main(String[] args) {

		int k;
		int n;

		int[] array;

		System.out.println("Введите значение натурального действительного K");
		k = valueChecking();

		System.out.println("Введите значение натурального действительного N");
		n = valueChecking();

		array = arrayFilling(k, n);
		System.out.println(Arrays.toString(array));

	}

	public static int valueChecking() {

		String str;
		int naturalValue;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}

		naturalValue = sc.nextInt();

		if (naturalValue <= 0) {
			System.out.println("try one more time, num must be positive");
			naturalValue = valueChecking();

		}

		return naturalValue;
	}

	public static int getsumOfDigits(int i) {
		int sum = 0;
		while (i != 0) {
			sum += (i % 10);
			i /= 10;
		}
		return sum;
	}

	public static int getCountOfArray(int k, int n) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			sum = getsumOfDigits(i);
			if (sum == k) {
				System.out.println("i =" + i);
				count++;
			}
		}
		return count;
	}

	public static int[] arrayFilling(int k, int n) {

		int[] array = new int[getCountOfArray(k, n)];
		int sum;
		int i = 0;

		for (int j = 1; j < n; j++) {
			sum = getsumOfDigits(j);
			if (sum == k) {
				array[i] = j;
				i++;
			}

		}

		return array;
	}

}
