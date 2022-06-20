package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task6 {
	// �������� �����, ������, ����������� �������� �� 3 ����� ������� ��������;

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;

		System.out.println("������� ������ ����������� �����");
		n1 = console();

		System.out.println("������� ������ ����������� �����");
		n2 = console();

		System.out.println("������� ������ ����������� �����");
		n3 = console();

		isPrime(n1, n2, n3);
	}

	public static int console() {

		String str;
		int naturalValue;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}

		naturalValue = sc.nextInt();

		if (naturalValue <= 0) {
			System.out.println("try one more time, num must me > 0");
			naturalValue = console();
		}

		return naturalValue;
	}

	public static void isPrime(int n1, int n2, int n3) {

		int n1n2;
		int n1n2n3;

		n1n2 = nodFinding(n1, n2);

		n1n2n3 = nodFinding(n1n2, n3);

		if (n1n2n3 == 1) {
			System.out.println("����� N1 = " + n1 + "; " + "N2 = " + n2 + "; " + "N3 = " + n3 + " ������� �������");
		} else {
			System.out.println(
					"����� N1 = " + n1 + "; " + "N2 = " + n2 + "; " + "N3 = " + n3 + " �� �������� ������� ��������");
		}

	}

	public static int nodFinding(int n1, int n2) {

		while (n2 != 0) {
			int tmp = n1 % n2;
			n1 = n2;
			n2 = tmp;
		}

		return n1;

	}

}
