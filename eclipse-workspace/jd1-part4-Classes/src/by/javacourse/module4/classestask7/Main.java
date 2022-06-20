package by.javacourse.module4.classestask7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Программа треугольник");
		Triangle triangle = triangleCreating();

		menuPrint();
		menuChoice(console(), triangle);

	}

	public static Triangle triangleCreating() {

		Triangle triangle = new Triangle();
		System.out.println("Введите значения координат точек треугольника");
		System.out.println("Ax = ");
		triangle.setAx(console());
		System.out.println("Ay = ");
		triangle.setAy(console());
		System.out.println("Bx = ");
		triangle.setBx(console());
		System.out.println("By = ");
		triangle.setBy(console());
		System.out.println("Cx = ");
		triangle.setCx(console());
		System.out.println("Cy = ");
		triangle.setCy(console());
		return triangle;

	}

	// проверка введенного значения int
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

	public static void menuPrint() {

		System.out.println("1 - Получить координаты треугольника");
		System.out.println("2 - Вычислить площадь треугольника");
		System.out.println("3 - Вычислить периметр треугольника");
		System.out.println("4 - Вычислить точку пересечения медиан треугольника");
		System.out.println("5 - Задать новые координаты треугольника");

	}

	public static void menuChoice(int numMenu, Triangle triangle) {

		switch (numMenu) {
		case 1:
			System.out.println("Получение значений координат треугольника");
			System.out.println(triangle.toString());
			menuPrint();
			menuChoice(console(), triangle);
			break;

		case 2:
			System.out.println("Вычисление площади треугольника");
			double area = triangle.areaChecking(triangle.getAx(), triangle.getAy(), triangle.getBx(), triangle.getBy(),
					triangle.getCx(), triangle.getCy());
			System.out.println("Area of triangle = " + area);
			menuPrint();
			menuChoice(console(), triangle);
			break;
			
		case 3:
			System.out.println("Вычисление периметра треугольника");
			double perimetr = triangle.perimetrChecking(triangle.getAx(), triangle.getAy(), triangle.getBx(), triangle.getBy(),
					triangle.getCx(), triangle.getCy());
			System.out.println("Perimetr of triangle = " + perimetr);
			menuPrint();
			menuChoice(console(), triangle);
			break;
			
		case 4:
			System.out.println("Вычисление точки пересечения медиан треугольника");
			triangle.spotOfIntersection();
			menuPrint();
			menuChoice(console(), triangle);
			break;
			
		case 5:
			System.out.println("Задать новое значение координат треугольника");
			System.out.println("Введите значения координат точек треугольника");
			System.out.println("Ax = ");
			triangle.setAx(console());
			System.out.println("Ay = ");
			triangle.setAy(console());
			System.out.println("Bx = ");
			triangle.setBx(console());
			System.out.println("By = ");
			triangle.setBy(console());
			System.out.println("Cx = ");
			triangle.setCx(console());
			System.out.println("Cy = ");
			triangle.setCy(console());
			
			menuPrint();
			menuChoice(console(), triangle);
			break;
			
		default:
			System.out.println("Не понятно!");
			menuPrint();
			menuChoice(console(), triangle);
			
		}
	}
}
