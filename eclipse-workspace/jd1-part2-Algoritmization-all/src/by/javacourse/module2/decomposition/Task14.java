package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task14 {
	// натуральное число в записи которого n цифр называется числом Армстронга, если
	// сумма его цифр возведенная в степень N
	// равна самому числу. Найти все числа Армстронга в промежутке от 1 до k
	public static void main(String[] args) {

		int k;

		System.out.println("Введите значение действительного k(предел поиска)");
		k = valueChecking();

		findingOfNum(k);

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

		if (naturalValue < 0) {
			System.out.println("try one more time, num must be positive");
			naturalValue = valueChecking();

		}

		return naturalValue;
	}

	public static int getCountsOfDigits(int i) {
		int countOfDigits = 0;

		while (i != 0) {

			countOfDigits++;
			i /= 10;

		}
		return countOfDigits;
	}

	public static int getsumOfDigits(int i) {
		int sum = 0;
		int countOfDigits = getCountsOfDigits(i);
		while (i != 0) {
			sum += Math.pow(i % 10, countOfDigits);
			i /= 10;
		}
		return sum;
	}

	public static void findingOfNum(int k) {
		for (int i = 1; i < k; i++) {
			if (getsumOfDigits(i) == i) {
				System.out.println("число армстронга = " + i);
			}

		}

	}

}