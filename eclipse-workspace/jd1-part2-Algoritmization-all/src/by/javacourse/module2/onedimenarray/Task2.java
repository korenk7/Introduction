package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

public class Task2 {

	// ���� ������������������ �������������� ����� �1,�2,�3...�n.
	// �������� ��� � �����, ������� ��������� Z ���� ������. ���������� ����������
	// �����.

	public static void main(String[] args) {
		int array[];
		int n;
		int z;

		int count;

		count = 0;

		System.out.println("������� ���������� ��������� �������");
		n = console();

		System.out.println("������� �������� z");
		z = console();

		array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 10);

			System.out.println("a" + i + " = " + array[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			if (array[i] > z) {
				array[i] = z;
				count++;
			}
			System.out.println("a" + i + " = " + array[i]);
		}

		System.out.println("Count of changings = " + count);

	}

	public static int console() {

		String str;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}

		return sc.nextInt();

	}

}
