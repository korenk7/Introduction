package by.htp.part5.ex4.view;

import by.avm.part5.ex4.logic.CaveLogic;
import by.htp.part5.ex4.entity.Dragon;

public class CaveView {

	public void showTreasuresInfo(Dragon dragon) {

		CaveLogic logic = new CaveLogic();
		System.out.println("There are all treasures in a dragon cave");
		System.out.println(logic.findAllTreasures(dragon).toString());

	}

	public void showMostExpensiveTreasure(Dragon dragon) {

		CaveLogic logic = new CaveLogic();
		System.out.println("Most expensive treasure in dragon cave is");
		System.out.println(logic.findExpensiveTreasure(dragon).toString());

	}

	public void showTreasuresforBuying(Dragon dragon, int summ) {

		CaveLogic logic = new CaveLogic();
		System.out.println("for " + summ + " you can buy");
		System.out.println(logic.chooseTreasures(dragon, summ).toString());
		int totalCost = 0;

		for (int i = 0; i < logic.chooseTreasures(dragon, summ).size(); i++) {
			totalCost += logic.chooseTreasures(dragon, summ).get(i).getPrice();
		}

		System.out.println("Summ is " + totalCost);

	}

}
