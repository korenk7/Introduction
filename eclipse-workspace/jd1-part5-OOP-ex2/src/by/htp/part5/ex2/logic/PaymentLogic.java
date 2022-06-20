package by.htp.part5.ex2.logic;

import java.util.Scanner;

import by.htp.part5.ex2.Payment;
import by.htp.part5.ex2.Payment.Product;

public class PaymentLogic {
	Scanner sc = new Scanner(System.in);

	public void addProduct(Payment payment) {

		System.out.println("Give me name of product");
		String name = sc.next();
		System.out.println("Give me price");

		while (!sc.hasNextInt()) {
			String someShit = sc.next();
			System.out.println(someShit + "is not an INT");
		}
		int price = sc.nextInt();

		if (payment.getSize() < payment.getCapacity()) {
			payment.getProductList()[payment.getSize()] = payment.new Product(name, price);
			payment.setSize(payment.getSize() + 1);
		} else {
			Product temp[] = new Product[payment.getCapacity()];
			temp = payment.getProductList();

			payment.setProductList(new Product[payment.getCapacity() * 2]);

			for (int i = 0; i < payment.getSize(); i++) {
				payment.getProductList()[i] = temp[i];
			}

			payment.getProductList()[payment.getSize()] = payment.new Product(name, price);
			payment.setSize(payment.getSize() + 1);
			payment.setCapacity(payment.getCapacity() * 2);
		}
		payment.setSumm(payment.getSumm() + price);

	}

	public void makePayment(Payment payment) {
		if (payment.getProductList()[0] == null) {
			System.out.println("YOUR BACKET IS EMPTY, CAN'T Pay for nothing");
		} else {
			System.out.println("CHECK OF ALL PRODUCT");
			System.out.println();
			for (int i = 0; i < payment.getSize(); i++) {
				System.out.println("1 - Product /" + payment.getProductList()[i].getName() + "/ price /"
						+ payment.getProductList()[i].getCost() + "/ euro");
			}
			System.out.println("Summ is "+payment.getSumm()+" euro");
			System.out.println("Have a nice day");
			System.out.println();
		}

		payment.setCapacity(1);
		payment.setSize(0);
		payment.setProductList(new Product[1]);
		payment.setSumm(0);
	}

}
