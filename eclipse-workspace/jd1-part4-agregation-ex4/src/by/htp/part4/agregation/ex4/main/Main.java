//Счета. Клиент может иметь несколько счетов в банке. Учитывать возмож-
//ность блокировки/разблокировки счета. Реализовать поиск и сортировку 
//счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем 
//счетам, имеющим положительный и отрицательный балансы отдельно.

package by.htp.part4.agregation.ex4.main;

import by.htp.part4.agregation.ex4.entity.Account;
import by.htp.part4.agregation.ex4.entity.Customer;
import by.htp.part4.agregation.ex4.logic.AccountLogic;
import by.htp.part4.agregation.ex4.logic.CustomerLogic;
import by.htp.part4.agregation.ex4.view.CustomerView;

public class Main {

	public static void main(String[] args) {

		CustomerLogic logic = new CustomerLogic();
		CustomerView view = new CustomerView();
		AccountLogic accLogic = new AccountLogic();

		Customer cus1 = new Customer("Lev Tolstoy");
		logic.pushAccount(cus1, new Account((int) ((Math.random()*10000)-5000)));
		logic.pushAccount(cus1, new Account((int) ((Math.random()*10000)-5000)));
		logic.pushAccount(cus1, new Account((int) ((Math.random()*10000)-5000)));
		logic.pushAccount(cus1, new Account((int) ((Math.random()*10000)-5000)));
		logic.pushAccount(cus1, new Account((int) ((Math.random()*10000)-5000)));
	
		
		view.printCustomerAccountInfo(cus1);
		logic.makePayment(cus1, 1, 4000);
		view.printCustomerAccountInfo(cus1);
		logic.addSumm(cus1, 1, 10000);
		view.printCustomerAccountInfo(cus1);
		accLogic.accountSearch(cus1, 2);
		
		accLogic.accountSortingByStatus(cus1);
		
		view.printCustomerAccountInfo(cus1);
		
		accLogic.accountSortingByBalance(cus1);
		
		view.printCustomerAccountInfo(cus1);
		
		accLogic.summOfNegativeAccounts(cus1);
		
		accLogic.summOfPositiveAccounts(cus1);
		
		
		
		
		
		
	}

}
