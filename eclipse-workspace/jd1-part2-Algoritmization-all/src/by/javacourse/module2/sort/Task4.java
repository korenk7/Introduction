package by.javacourse.module2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
	// ���������� ��������
	// ���� ������������������ ����� a1<a2<...<an.
	// ��������� ����������� ����� � ������� �����������
	// ��� ����� ������������ ��� �������� ����� � ���� �����, �������� ������������
	// ���������� ���������� ������������
	public static void main(String[] args) {
		double array[];
		int n1;
		double temp;
		int changingCount;

		System.out.println("������� ���������� ��������� ������� ������� n1");
		n1 = console();

		array = new double[n1];

		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10;
		}

		System.out.println(Arrays.toString(array));

		sorting(array);

		System.out.println("�� ������� a1<a2<...<an");
		System.out.println(Arrays.toString(array));

		changingCount = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j + 1] > array[j]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					changingCount++;
				}
			}
		}
		System.out.println("AFTER SORTING");
		System.out.println(Arrays.toString(array));
		System.out.println("Count of Changings = " + changingCount);

		changingCount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j + 1] < array[j]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					changingCount++;
				}
			}
		}
		System.out.println("IN ANOTHER WAY");
		System.out.println(Arrays.toString(array));
		System.out.println("Count of Changings = " + changingCount);
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

	public static void sorting(double[] array) {
		double temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}

}