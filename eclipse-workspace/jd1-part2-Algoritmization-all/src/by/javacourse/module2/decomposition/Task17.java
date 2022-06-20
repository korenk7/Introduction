package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task17 {
	// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
	// цифр.
	// Сколько таких действий нужно произвести чтобы получился 0?

	public static void main(String[] args) {
		int n;
		int temp;
		int countOfDeduction = 0;

		System.out.println("Введите значение действительного натурального числа N)");
		n = valueChecking();
		temp = n;

		while (temp != 0) {

			temp = temp - sumOfDigits(temp);
			countOfDeduction++;

		}

		System.out.println("Для получения 0 из числа N = " + n + " нужно " + countOfDeduction + " действий");

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

		if (naturalValue <= 1) {
			System.out.println("try one more time, num must have min 2 digits");
			naturalValue = valueChecking();

		}

		return naturalValue;
	}

	public static int sumOfDigits(int i) {

		int sum = 0;

		while (i != 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;

	}

}
