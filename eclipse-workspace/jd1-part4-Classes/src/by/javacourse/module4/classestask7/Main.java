package by.javacourse.module4.classestask7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("��������� �����������");
		Triangle triangle = triangleCreating();

		menuPrint();
		menuChoice(console(), triangle);

	}

	public static Triangle triangleCreating() {

		Triangle triangle = new Triangle();
		System.out.println("������� �������� ��������� ����� ������������");
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

	// �������� ���������� �������� int
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

		System.out.println("1 - �������� ���������� ������������");
		System.out.println("2 - ��������� ������� ������������");
		System.out.println("3 - ��������� �������� ������������");
		System.out.println("4 - ��������� ����� ����������� ������ ������������");
		System.out.println("5 - ������ ����� ���������� ������������");

	}

	public static void menuChoice(int numMenu, Triangle triangle) {

		switch (numMenu) {
		case 1:
			System.out.println("��������� �������� ��������� ������������");
			System.out.println(triangle.toString());
			menuPrint();
			menuChoice(console(), triangle);
			break;

		case 2:
			System.out.println("���������� ������� ������������");
			double area = triangle.areaChecking(triangle.getAx(), triangle.getAy(), triangle.getBx(), triangle.getBy(),
					triangle.getCx(), triangle.getCy());
			System.out.println("Area of triangle = " + area);
			menuPrint();
			menuChoice(console(), triangle);
			break;
			
		case 3:
			System.out.println("���������� ��������� ������������");
			double perimetr = triangle.perimetrChecking(triangle.getAx(), triangle.getAy(), triangle.getBx(), triangle.getBy(),
					triangle.getCx(), triangle.getCy());
			System.out.println("Perimetr of triangle = " + perimetr);
			menuPrint();
			menuChoice(console(), triangle);
			break;
			
		case 4:
			System.out.println("���������� ����� ����������� ������ ������������");
			triangle.spotOfIntersection();
			menuPrint();
			menuChoice(console(), triangle);
			break;
			
		case 5:
			System.out.println("������ ����� �������� ��������� ������������");
			System.out.println("������� �������� ��������� ����� ������������");
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
			System.out.println("�� �������!");
			menuPrint();
			menuChoice(console(), triangle);
			
		}
	}
}
