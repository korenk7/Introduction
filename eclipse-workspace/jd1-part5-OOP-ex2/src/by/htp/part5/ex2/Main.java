package by.htp.part5.ex2;


import by.htp.part5.ex2.logic.PaymentLogic;
import by.htp.part5.ex2.view.PaymentView;

public class Main {

	/*
	 * ������� ����� Payment (�������) � ���������� �������, � ������� ��������
	 * �������� ����� ������������ ������� �� ���������� �������.
	 */

	public static void main(String[] args) {

		PaymentView view = new PaymentView();
		PaymentLogic logic = new PaymentLogic();
		Payment payment = new Payment();
		
		
		view.showMenu();
		view.menuChoise(logic,payment);
		

		

	}

}
