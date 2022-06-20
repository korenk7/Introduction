package by.javacourse.module2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

		// TODO Auto-generated method stub
		// �� ��������� ������ ������ ������������ N �����. �������� �����, ������,
		// ������������ ����� ������ �� ��� �����
		// ����� ������� ����������. ���������� ����� ������� � ������.

		public static void main(String[] args) {

			int n;
			double[] arrayOfx;
			double[] arrayOfy;
			double Maxlength;
			double x1;
			double y1;
			double x2;
			double y2;

			System.out.println("������� ���������� ����� �� ���������");
			n = countChecking();

			System.out.println("���������� ��������� � ������� = " + n);
			arrayOfx = new double[n];
			arrayOfy = new double[n];

			for (int i = 0; i < n; i++) {
				System.out.println("������� ���������� X" + (i + 1));
				arrayOfx[i] = coordinatesChecking();
				System.out.println("������� ���������� Y" + (i + 1));
				arrayOfy[i] = coordinatesChecking();

			}

			System.out.println(Arrays.toString(arrayOfx));
			System.out.println(Arrays.toString(arrayOfy));

			Maxlength = 0;
			x1 = 0;
			y1 = 0;
			x2 = 0;
			y2 = 0;

			for (int i = 0; i < n - 1; i++) { // ��������� ������� ����. ������� ���������� ���������� �/� ��������
												// ������������
				if (distanseCounting(arrayOfx[i], arrayOfx[i + 1], arrayOfy[i], arrayOfy[i + 1]) > Maxlength) {
					Maxlength = distanseCounting(arrayOfx[i], arrayOfx[i + 1], arrayOfy[i], arrayOfy[i + 1]);
					x1 = arrayOfx[i];
					x2 = arrayOfx[i + 1];
					y1 = arrayOfy[i];
					y2 = arrayOfy[i + 1];

				}
			}

			System.out.println("������������ ���������� ����� ������������ = " + Maxlength);
			System.out.println("��� ���������� ����� ������� (" + x1 + " ; " + y1 + ") � (" + x2 + " ; " + y2 + ")");

		}

		public static int countChecking() {

			String str;
			int naturalValue;

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			while (!sc.hasNextInt()) {
				str = sc.nextLine();
				System.out.println("try one more time, " + str + " it's not a Integer");
			}

			naturalValue = sc.nextInt();

			if (naturalValue == 1) {
				System.out.println("try one more time, can't work with 1 value");
				naturalValue = countChecking();

			}

			if (naturalValue <= 0) {
				System.out.println("try one more time, num must me > 0");
				naturalValue = countChecking();

			}

			return naturalValue;
		}

		public static double coordinatesChecking() {

			String str;

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			while (!sc.hasNextDouble()) {
				str = sc.nextLine();
				System.out.println("try one more time, " + str + " it's not a Double value");
			}

			return sc.nextDouble();

		}

		public static double distanseCounting(double x1, double y1, double x2, double y2) {

			return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		}

	}
