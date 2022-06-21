package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task9 {
	// Даны числа X,Y,Z,T - длины сторон четырехугольника. Написать метод(ы)
		// вычисления его площади если
		// угол между сторонами X,Y прямой;

		public static void main(String[] args) {
			double x;
			double y;
			double z;
			double t;

			double area;

			System.out.println("Введите значение X");
			x = valueOfLengthChecking();
			System.out.println("Введите значение Y");
			y = valueOfLengthChecking();
			System.out.println("Введите значение Z");
			z = valueOfLengthChecking();
			System.out.println("Введите значение T");
			t = valueOfLengthChecking();

			area = areaCounting(x, y, z, t);

			System.out.println("площадь четырехугольника = " + area);

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

		// вычисляем площадь четырехугольника как сумму площади прямоугольного
		// треугольника и площади треугольника по трем сторонам
		public static double areaCounting(double x, double y, double z, double t) {
			double gipotenuse;
			double RectangualTriangleArea;
			double LastTriangleArea;

			gipotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

			RectangualTriangleArea = areaOfRectangularTriangleCounting(x, y);

			LastTriangleArea = areaOfTriangleCounting(z, t, gipotenuse);

			return RectangualTriangleArea + LastTriangleArea;

		}

		// разделяем четырехугольник на 2 треугольника вычисляем площадь треугольника с
		// прямым углом
		public static double areaOfRectangularTriangleCounting(double x, double y) {

			return x * y * 0.5;

		}

		// вычисляем площадь треугольника по формуле герона
		public static double areaOfTriangleCounting(double x, double y, double gipotenuse) {
			double halfPerimetr;

			halfPerimetr = (x + y + gipotenuse) / 2;

			return Math.sqrt(halfPerimetr * (halfPerimetr - x) * (halfPerimetr - y) * (halfPerimetr - gipotenuse));

		}

	}
