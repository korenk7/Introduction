package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task15 {
	// ����� ����������� N ������� �����, ����� � ������� �������� ������
	// ������������ ������������������
	// �������� 1234,5789)
	public static void main(String[] args) {

		int n;

		System.out.println("������� �������� ��������������� N(���������� ���� � �����)");
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
			// ���� ���������� ������� � ������������ ������������������ ���� � �����
			// (������������ ��������)
			// ����� ���������� ���� � �����, �� ������������������ ������������, �.�. ��
			// ��� ����� �� ������� ������
			if (count == n) {
				System.out.println("������������������ " + i + " ������������");
			}

			count = 0;

		}

	}

	// ���������� ���������� ������� � ������������ ������������������ ����

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
