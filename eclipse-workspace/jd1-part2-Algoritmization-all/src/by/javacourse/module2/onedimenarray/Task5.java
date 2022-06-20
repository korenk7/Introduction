package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

//���� ����� ����� �1, �2, �3... �n
//������� �� ������ �� �����, ��� ������� an>n

public class Task5 {

	public static void main(String[] args) {

		int array[];
		int n;

		System.out.println("������� ���������� ��������� �������");
		n = console();

		array = new int[n];

		for (int i = 0; i < n; i++) {

			array[i] = (int) (Math.random() * 100 - 50);

			if (array[i] > i) {
				System.out.println("a" + i + " = " + array[i] + " ");
			}
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
