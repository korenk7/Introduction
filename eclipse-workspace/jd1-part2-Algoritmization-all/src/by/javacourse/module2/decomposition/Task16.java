package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task16 {
	// �������� ���������, ������������ ����� n-������� �����, ���������� ������
	// �������� �����
	// ���������� ��� �� ������� ������ ���� � ������ �����.
	public static void main(String[] args) {

		int n;

		System.out.println("������� �������� ��������������� N(���������� ���� � �����)");
		n = valueChecking();

		int count = 0;
		int sumOfDigits;
		int countOfEven;

		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {

			count = countOfOdd(i);
			// ���� ���������� �������� ���� � �����
			// (������������ ��������)
			// ����� ���������� ���� � �����, �������� �������� ��� ���������� ������
			// ��� ����� �� �������
			if (count == n) {
				System.out.print("����� " + i + " ������� �� �������� ����� ");
				sumOfDigits = sumOfDigits(i);
				System.out.print("����� ���� ����� " + i + " = " + sumOfDigits);
				countOfEven = countOfEven(sumOfDigits);
				System.out.println(" ���������� ������ ���� � ��� " + countOfEven);

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

	// ���������� ���������� �������� ���� � �����
	public static int countOfOdd(int i) {
		int count = 0;

		while (i != 0) {
			if (i % 2 != 0) { // ����� � ����� ��������?
				count++;
			}
			i /= 10;
		}
		return count;

	}

	// ���������� ����� ���� � �����
	public static int sumOfDigits(int i) {

		int sum = 0;

		while (i != 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;

	}

	// ���������� ���������� ������ ����
	public static int countOfEven(int i) {
		int count = 0;

		while (i != 0) {
			if (i % 2 == 0) { // ����� � ����� ������?
				count++;
			}
			i /= 10;
		}
		return count;

	}
}