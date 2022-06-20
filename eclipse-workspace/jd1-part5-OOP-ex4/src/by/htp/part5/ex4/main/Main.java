package by.htp.part5.ex4.main;

import by.htp.part5.ex4.entity.Dragon;
import by.htp.part5.ex4.view.CaveView;

public class Main {

	public static void main(String[] args) {

		Dragon dragon = new Dragon();

		showMenu();
		int choosingValue = 3;
		chooseMenu(choosingValue, dragon);

	}

	public static void showMenu() {
		System.out.println("Choose what do you want to do");
		System.out.println("1 to see all the treasures");
		System.out.println("2 to choose most expensive treasure");
		System.out.println("3 to choose a treasures for some summ");
	}

	public static void chooseMenu(int value, Dragon dragon) {
		CaveView view = new CaveView();
		
		switch (value) {

		case 1:
			view.showTreasuresInfo(dragon);
			break;
		case 2:
			view.showMostExpensiveTreasure(dragon);
			break;
		case 3:
			int summ = 1500;
			view.showTreasuresforBuying(dragon, summ);
			break;
		}

	}

}