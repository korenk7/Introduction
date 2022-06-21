package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task16 {
	// Написать программу, определяющую сумму n-значных чисел, содержащих только
	// нечетные цифры
	// определить так же сколько четных цифр в данной сумме.
	public static void main(String[] args) {

		int n;

		System.out.println("Введите значение действительного N(количество цифр в числе)");
		n = valueChecking();

		int count = 0;
		int sumOfDigits;
		int countOfEven;

		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {

			count = countOfOdd(i);
			// если количество нечетных цифр в числе
			// (возвращенное значение)
			// равно количеству цифр в числе, значение подходит под выполнение задачи
			// что нужно по условию
			if (count == n) {
				System.out.print("÷èñëî " + i + " ñîñòîèò èç íå÷åòíûõ ÷èñåë ");
				sumOfDigits = sumOfDigits(i);
				System.out.print("ñóììà öèôð ÷èñëà " + i + " = " + sumOfDigits);
				countOfEven = countOfEven(sumOfDigits);
				System.out.println(" êîëè÷åñòâî ÷åòíûõ öèôð â íåé " + countOfEven);

			}

			count = 0;

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

		if (naturalValue <= 1) {
			System.out.println("try one more time, Sequence must have min 2 digits");
			naturalValue = valueChecking();

		}

		return naturalValue;
	}

	// Определяем количество нечетных цифр в числе
	public static int countOfOdd(int i) {
		int count = 0;

		while (i != 0) {
			if (i % 2 != 0) {// цифра в числе нечетная?
				count++;
			}
			i /= 10;
		}
		return count;

	}

	// Определяем сумму цифр в числе
	public static int sumOfDigits(int i) {

		int sum = 0;

		while (i != 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;

	}

	// Определяем количество чётных цифр
	public static int countOfEven(int i) {
		int count = 0;

		while (i != 0) {
			if (i % 2 == 0) { // цифра в числе нечетная?
				count++;
			}
			i /= 10;
		}
		return count;

	}
}
