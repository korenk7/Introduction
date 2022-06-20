package by.htp.part4.agregation.ex4.view;

import by.htp.part4.agregation.ex4.entity.Customer;

public class CustomerView {

	public void printCustomerInfo(Customer customer) {
		// System.out.println(customer.toString());
	}

	public void printCustomerAccountInfo(Customer customer) {
		System.out.println(customer.getName());
		for (int i = 0; i < customer.getAccounts().size(); i++) {
			System.out.println(customer.getAccounts().get(i));
		}

	}

}
