package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task11 {
	// Ќаписать метод(ы) определ€ющие в каком из двух чисел больше цифр
	public static void main(String[] args) {

		int n1;
		int countOfDigits1;
		int n2;
		int countOfDigits2;

		System.out.println("¬ведите значение натурального действительного N1");
		n1 = valueChecking();

		System.out.println("¬ведите значение натурального действительного N1");
		n2 = valueChecking();

		countOfDigits1 = getCountsOfDigits(n1);
		System.out.println("N1 = " + n1);
		System.out.println("количество цифр = " + countOfDigits1);

		countOfDigits2 = getCountsOfDigits(n2);
		System.out.println("N2 = " + n2);
		System.out.println("количество цифр = " + countOfDigits2);

		if (countOfDigits1 > countOfDigits2) {
			System.out.println("count of N1 = " + countOfDigits1 + " > count of N2 = " + countOfDigits2);
		} else if (countOfDigits1 < countOfDigits2) {
			System.out.println("count of N1 = " + countOfDigits1 + " < count of N2 = " + countOfDigits2);
		} else {
			System.out.println("count of digits are the same");
		}

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
}