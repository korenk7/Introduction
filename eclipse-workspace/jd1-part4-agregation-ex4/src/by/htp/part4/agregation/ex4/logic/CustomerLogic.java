package by.htp.part4.agregation.ex4.logic;

import by.htp.part4.agregation.ex4.entity.Account;
import by.htp.part4.agregation.ex4.entity.Customer;
import by.htp.part4.agregation.ex4.entity.Status;

public class CustomerLogic {

	public void pushAccount(Customer customer, Account account) {
		customer.getAccounts().add(account);
	}

	public void makePayment(Customer customer, int id, int summ) {
		int accountID = id - 1;
		Account account = customer.getAccounts().get(accountID);

		if (account.getCurrent() == Status.BLOCKED) {
			System.out.println("You can't make payment from this account, it blocked");
		} else {
			int balance = account.getBalance();
			int result = balance - summ;
			if (result < account.getLimit()) {
				System.out.println("You can't make payment from this account, credit limit exceeded");
			} else {
				account.setBalance(result);
				if (result < 0) {
					account.setCurrent(Status.BLOCKED);
				}
			}
		}
	}

	public void addSumm(Customer customer, int id, int summ) {
		int accountID = id - 1;
		Account account = customer.getAccounts().get(accountID);
		account.setBalance(account.getBalance() + summ);

		if (account.getBalance() > 0 && account.getCurrent() == Status.BLOCKED) {
			account.setCurrent(Status.NOT_BLOCKED);
		}
	}

}
