package by.avm.part5.ex4.logic;

import java.util.ArrayList;
import java.util.List;

import by.avm.part5.ex4.dao.TreasureResourse;
import by.htp.part5.ex4.entity.Dragon;
import by.htp.part5.ex4.entity.Treasure;

public class CaveLogic {

	public List<Treasure> findAllTreasures(Dragon dragon) {

		TreasureResourse resourse = new TreasureResourse();
		dragon.getCave().setTreasures(resourse.loadTreasureList());

		return dragon.getCave().getTreasures();
	}

	public Treasure findExpensiveTreasure(Dragon dragon) {

		findAllTreasures(dragon);

		int upPrice = dragon.getCave().getTreasures().get(0).getPrice();
		int id = 0;

		for (int i = 0; i < dragon.getCave().getTreasures().size(); i++) {
			if (dragon.getCave().getTreasures().get(i).getPrice() > upPrice) {
				upPrice = dragon.getCave().getTreasures().get(i).getPrice();
				id = i;
			}
		}

		return dragon.getCave().getTreasures().get(id);

	}

	public List<Treasure> chooseTreasures(Dragon dragon, int sum) {
		int index = 1;
		int summOfPrices = 0;
		TreasureResourse resourse = new TreasureResourse();
		List<Treasure> treasuresForSumm = new ArrayList<Treasure>();

		while (summOfPrices < sum) {

			treasuresForSumm = resourse.loadTreasureOneByOne(index);

			for (int i = 0; i < treasuresForSumm.size(); i++) {
				summOfPrices += treasuresForSumm.get(i).getPrice();
			}

			if (summOfPrices < sum) {
				summOfPrices = 0;
				index++;
			} else {
				break;
			}
		}
		treasuresForSumm = resourse.loadTreasureOneByOne((index-1));

		return treasuresForSumm;
	}

}
