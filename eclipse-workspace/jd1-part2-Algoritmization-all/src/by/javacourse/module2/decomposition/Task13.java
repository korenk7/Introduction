package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task13 {
	// два простых числа называются близнецами если они отличаются друг от друга на
	// 2 (например 41 и 43).
	// найти и распечатать все пары близнецов из отрезка [n, 2n], где n натуральное
	// > 2.
	public static void main(String[] args) {
		final int difference = 2;
		int n;

		System.out.println("Введите значение натурального действительного N(больше 2)");
		n = valueChecking();

		twinsFinding(n, difference);

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

		if (naturalValue < 3) {
			System.out.println("try one more time, num must be > 2");
			naturalValue = valueChecking();

		}

		return naturalValue;
	}

	public static void twinsFinding(int n, int difference) {

		for (int i = n; i <= (2 * n) - difference; i++) {
			System.out.println("First of twins is " + i + " second of twins is " + (i + 2));
		}

	}

}