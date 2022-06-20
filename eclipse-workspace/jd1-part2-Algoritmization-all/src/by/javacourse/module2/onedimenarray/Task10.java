package by.javacourse.module2.onedimenarray;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
	// ��� ������������� ������ � ����������� ��������� n. ����� ������, �������� ��
	// ���� ������ ������ �������
	// (�������������� �������� ��������� ������) �������������� ������ ��
	// ������������

	public static void main(String[] args) {
		int array[];
		int n;
		int newArraySize;

		System.out.println("������� ���������� ��������� �������");
		n = console();
		array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		newArraySize = array.length;

		System.out.println(Arrays.toString(array));

		for (int i = 1; i < array.length; i++) {
			if (i % 2 != 0) {
				array[i] = 0;
				newArraySize--;
			}
		}

		System.out.println();
		System.out.println(Arrays.toString(array));

		for (int i = 1; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i / 2] = array[i];

			}
		}

		System.out.println();

		for (int i = 0; i < newArraySize; i++) {
			System.out.print(array[i] + " ");
		}

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
