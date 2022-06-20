package by.javacourse.module4.classestask5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		menuPrint();
		menuChoice(menuConsoleChecking(), counter);

	}

	public static void menuPrint() {
		System.out.println("������������ ���������� �������");
		System.out.println("1 - ��������� ������ �������� � ������������� ����������");
		System.out.println("2 - ��������� ������ �������� � ��������� ����������");
	}

	public static void menuChoice(int numMenu, Counter counter) {

		switch (numMenu) {
		case 1:
			counter.setDownLimit((int) (Math.random() * 100));
			System.out.println("������ ������� " + counter.getDownLimit());
			counter.setUpLimit((int) (counter.getDownLimit()+Math.random() * 100));
			System.out.println("������� ������� " + counter.getUpLimit());
			counter.setValue((counter.getUpLimit()-counter.getDownLimit())/2+counter.getDownLimit());
			System.out.println("�������� �������� " + counter.getValue());
			
			submenuPrint();
			submenuChoice(subMenuConsoleChecking(), counter);
			break;

		case 2:
			System.out.println("������� ������ ������� ���������");
			counter.setDownLimit(intChecking());
			System.out.println("������ ������� " + counter.getDownLimit());
			System.out.println("������� �������� ������� ���������");
			counter.setUpLimit(intChecking());
			System.out.println("������� ������� " + counter.getUpLimit());
			System.out.println("������� �������� ��������");
			counter.setValue(intChecking());
			System.out.println("�������� ��������"  + counter.getValue());
			submenuPrint();
			submenuChoice(subMenuConsoleChecking(), counter);

			break;

		default:
			System.out.println("�� �������!");
		}
	}

	public static void submenuChoice(int numMenu, Counter counter) {

		switch (numMenu) {
		case 1:
			counter.increment();
			submenuPrint();
			submenuChoice(subMenuConsoleChecking(), counter);
			
			break;

		case 2:
			counter.decrement();
			submenuPrint();
			submenuChoice(subMenuConsoleChecking(), counter);

			break;
		case 3:
			System.out.println("������ ������� " + counter.getDownLimit());
			System.out.println("������� ������� " + counter.getUpLimit());
			System.out.println("��������� �������� " + counter.getValue());
			submenuPrint();
			submenuChoice(subMenuConsoleChecking(), counter);
			break;
		case 4:
			System.out.println("��������� ���������");
			System. exit(0);
			break;

		default:
			System.out.println("�� �������!");
		}
	}

	public static int menuConsoleChecking() {

		String str;
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}
		value = sc.nextInt();

		if (value <= 0 || value > 2) {
			System.out.println("try one more time, " + value + " is out of diapason");
			menuPrint();
			menuConsoleChecking();
		}

		return value;

	}

	public static void submenuPrint() {
		System.out.println("1 - ��������� �������� �������� �� 1");
		System.out.println("2 - ��������� �������� �������� �� 1");
		System.out.println("3 - ��������� ��������");
		System.out.println("4 - �������� ���������� ���������");
	}

	public static int subMenuConsoleChecking() {

		String str;
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}
		value = sc.nextInt();

		if (value <= 0 || value > 4) {
			System.out.println("try one more time, " + value + " is out of diapason");
			menuPrint();
			menuConsoleChecking();
		}

		return value;

	}
	
	public static int intChecking() {

		String str;
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}
		value = sc.nextInt();

		return value;

	}

}
