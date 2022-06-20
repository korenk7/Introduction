package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task3 {
	// Вычислить площадь правильного шестиугольника стороной а, используя метод
		// вычисления площади треугольника
		public static void main(String[] args) {

			double a;
			double triangleArea;

			System.out.println("Введите длину стороны шестиугольника");
			a = console();

			triangleArea = areaCalculating(a);

			System.out.println("Площадь треугольника = " + triangleArea);
			System.out.println("Площадь шестиугольника = "+ 6*triangleArea);

		}

		public static double console() {

			String str;
			double naturalValue;

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			while (!sc.hasNextDouble()) {
				str = sc.nextLine();
				System.out.println("try one more time, " + str + " it's not a double value");
			}

			naturalValue = sc.nextDouble();

			if (naturalValue <= 0) {
				System.out.println("try one more time, num must me > 0");
				naturalValue = console();
			}
			return naturalValue;
		}

		public static double areaCalculating(double a) {

			return 0.5 * Math.pow(a, 2) * Math.sin(Math.PI/3);
		}

	}

