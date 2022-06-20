package by.htp.part5.ex2.view;

import java.util.Scanner;

import by.htp.part5.ex2.Payment;
import by.htp.part5.ex2.logic.PaymentLogic;

public class PaymentView {

	Scanner sc = new Scanner(System.in);

	public void showMenu() {
		System.out.println("Store is working");
		System.out.println("Press number what you want to do");
		System.out.println();
		System.out.println("Choose 1 for add the product");
		System.out.println("Choose 2 for payment");
	}

	public void intChecking() {
		while (!sc.hasNextInt()) {
			String menuChoise = sc.next();
			System.out.println(menuChoise + " is not Integer");
			System.out.println();
			showMenu();
		}
	}

	public void menuChoise(PaymentLogic logic, Payment payment) {
		intChecking();
		int choise = sc.nextInt();

		switch (choise) {

		case 1:

			logic.addProduct(payment);
			showMenu();
			menuChoise(logic, payment);
			break;

		case 2:
			
			logic.makePayment(payment);
			showMenu();
			menuChoise(logic, payment);
			break;

		}
	}
}
