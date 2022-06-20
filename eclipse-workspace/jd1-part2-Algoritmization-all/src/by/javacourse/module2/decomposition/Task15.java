package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task15 {
	// Найти натуральные N значные числа, цифры в которых образуют строго
	// возрастающую последовательность
	// например 1234,5789)
	public static void main(String[] args) {

		int n;

		System.out.println("Введите значение действительного N(количество цифр в числе)");
		n = valueChecking();

		findingOfNum(n);

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

	public static void findingOfNum(int n) {
		int count = 0;

		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {

			count = countOfSequence(i);
			// если количество стоящих в возрастающей последовательности цифр в числе
			// (возвращенное значение)
			// равно количеству цифр в числе, то последовательность возрастающая, т.е. то
			// что нужно по условию задачи
			if (count == n) {
				System.out.println("последовательность " + i + " возрастающая");
			}

			count = 0;

		}

	}

	// определяем количество стоящих в возрастаемой последовательности цифр

	public static int countOfSequence(int i) {
		int count = 0;

		while (i != 0) {
			if (i % 10 > (i % 100) / 10) {
				count++;
			}
			i /= 10;
		}
		return count;

	}

}
