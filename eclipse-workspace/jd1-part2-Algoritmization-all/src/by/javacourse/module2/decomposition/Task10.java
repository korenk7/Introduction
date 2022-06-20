package by.javacourse.module2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
	// Дано натуральное число N. Написать метод(методы) для формирования массива,
	// элементами которого являются цифры числа N

	public static void main(String[] args) {

		int n;
		int countOfDigits;
		int[] array;

		System.out.println("Введите значение натурального действительного N");
		n = valueChecking();

		countOfDigits = getCountsOfDigits(n);
		System.out.println("N = " + n);
		System.out.println("количество цифр = " + countOfDigits);

		array = arrayFilling(n, countOfDigits);
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

	public static int getCountsOfDigits(int n) {
		int countOfDigits = 0;

		while (n != 0) {

			countOfDigits++;
			n /= 10;

		}
		return countOfDigits;
	}

	public static int[] arrayFilling(int n, int countOfDigits) {

		int[] array = new int[countOfDigits];

		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = n % 10;
			n = n / 10;
		}

		System.out.println(Arrays.toString(array));

		return array;
	}

}
