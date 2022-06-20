package by.javacourse.module1.cycles;

// �������� ��������� ��� ������������ ������ ����� ������������� �����, � ��������� ���������
// ��� ����� �� 1 �� ��������� ������������� �����. 

import java.util.*;

public class Task1 {
	@SuppressWarnings("resource")
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int x;
		int sum = 0;

		System.out.println("������� ����� ������������� �����");

		x = sc.nextInt();
		x = positiveChecking(x);

		for (int i = 1; i <= x; i++) {
			sum = sum + i;
		}

		System.out.println("����� ����� " + sum);

	}

	public static int positiveChecking(int x) {
		int value = x;
		while (value < 0) {
			System.out.println("value must be positive, enter new X");
			value = sc.nextInt();
		}
		return value;

	}

}
