package by.htp.part4.agregation.ex4.logic;

import java.util.Collections;
import java.util.Comparator;

import by.htp.part4.agregation.ex4.entity.Account;
import by.htp.part4.agregation.ex4.entity.Customer;

public class AccountLogic {

	public void accountSearch(Customer customer, int id) {

		for (int i = 0; i < customer.getAccounts().size(); i++) {
			if (customer.getAccounts().get(i).getAccountID() == id) {
				System.out.println("Account with id = " + id);
				System.out.println(customer.getAccounts().get(i).toString());
			}
		}
	}

	public void accountSortingByStatus(Customer customer) {
		Collections.sort(customer.getAccounts());
	}

	public void accountSortingByBalance(Customer customer) {
		Comparator<Account> comparator = new AccountByBalanceComparator();
		customer.getAccounts().sort(comparator);

	}

	public void summOfPositiveAccounts(Customer customer) {
		int summ = 0;
		for (int i = 0; i < customer.getAccounts().size(); i++) {
			if (customer.getAccounts().get(i).getBalance() > 0) {
				summ = summ + customer.getAccounts().get(i).getBalance();
			}
		}
		System.out.println("summ of positive Accounts = " + summ);
	}

	public void summOfNegativeAccounts(Customer customer) {
		int summ = 0;
		for (int i = 0; i < customer.getAccounts().size(); i++) {
			if (customer.getAccounts().get(i).getBalance() < 0) {
				summ = summ + Math.abs(customer.getAccounts().get(i).getBalance());
			}
		}
		System.out.println("summ of positive Accounts = " + summ);
	}

}

class AccountByBalanceComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return o1.getBalance() - o2.getBalance();
	}

}
