package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task9 {
	// ���� ����� X,Y,Z,T - ����� ������ ����������������. �������� �����(�)
		// ���������� ��� ������� ����
		// ���� ����� ��������� X,Y ������;

		public static void main(String[] args) {
			double x;
			double y;
			double z;
			double t;

			double area;

			System.out.println("������� �������� X");
			x = valueOfLengthChecking();
			System.out.println("������� �������� Y");
			y = valueOfLengthChecking();
			System.out.println("������� �������� Z");
			z = valueOfLengthChecking();
			System.out.println("������� �������� T");
			t = valueOfLengthChecking();

			area = areaCounting(x, y, z, t);

			System.out.println("������� ���������������� = " + area);

		}

		public static double valueOfLengthChecking() {

			String str;
			double naturalValue;

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			while (!sc.hasNextDouble()) {
				str = sc.nextLine();
				System.out.println("try one more time, " + str + " it's not a Double");
			}

			naturalValue = sc.nextInt();

			if (naturalValue <= 0) {
				System.out.println("try one more time, num must be positive");
				naturalValue = valueOfLengthChecking();

			}

			return naturalValue;
		}

		// ��������� ������� ���������������� ��� ����� ������� ��������������
		// ������������ � ������� ������������ �� ���� ��������
		public static double areaCounting(double x, double y, double z, double t) {
			double gipotenuse;
			double RectangualTriangleArea;
			double LastTriangleArea;

			gipotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

			RectangualTriangleArea = areaOfRectangularTriangleCounting(x, y);

			LastTriangleArea = areaOfTriangleCounting(z, t, gipotenuse);

			return RectangualTriangleArea + LastTriangleArea;

		}

		// ��������� ��������������� �� 2 ������������ ��������� ������� ������������ �
		// ������ �����
		public static double areaOfRectangularTriangleCounting(double x, double y) {

			return x * y * 0.5;

		}

		// ��������� ������� ������������ �� ������� ������
		public static double areaOfTriangleCounting(double x, double y, double gipotenuse) {
			double halfPerimetr;

			halfPerimetr = (x + y + gipotenuse) / 2;

			return Math.sqrt(halfPerimetr * (halfPerimetr - x) * (halfPerimetr - y) * (halfPerimetr - gipotenuse));

		}

	}
