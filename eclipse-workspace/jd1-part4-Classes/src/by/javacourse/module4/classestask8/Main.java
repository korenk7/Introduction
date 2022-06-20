package by.javacourse.module4.classestask8;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")

	static Scanner scanner = new Scanner(System.in);
	static Customers customers = new Customers();

	public static void main(String[] args) {

		menuPrint();
		menuChoise(menuValidation());

	}

	public static void menuPrint() {
		System.out.println("menu is working");
		System.out.println("1 for creating new customer");
		System.out.println("2 for showing all customers in array");
		System.out.println("3 for showing of sorted customers");
		System.out.println("4 for search customers between card numbers");

	}

	public static void menuChoise(int menuchoise) {

		switch (menuchoise) {
		case 1:
			customers.pushCustomer(Customer.getNewCustomer());
			menuPrint();
			menuChoise(menuValidation());
			break;

		case 2:
			customers.showCustomer();
			menuPrint();
			menuChoise(menuValidation());
			break;

		case 3:
			customers.sortByName();
			customers.showCustomer();
			menuPrint();
			menuChoise(menuValidation());
			break;

		case 4:
			System.out.println("give please start of interval");
			String start = scanner.next();
			System.out.println("give please end of interval");
			String finish = scanner.next();
			customers.print_if_card_in(start, finish);
			menuPrint();
			menuChoise(menuValidation());
			break;

		default:
			System.out.println("Something is going wrong");
			menuPrint();
			menuChoise(menuValidation());
		}

	}

	public static int menuValidation() {
		
		if(scanner.hasNextInt()==true){	
			int value = scanner.nextInt();
			return value;
		} else {
			System.out.println(scanner.next() +" is not a value as we need");
			return 0;
		}
		

		
	}
}
