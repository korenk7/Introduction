package by.htp.part5.ex4.main;

import by.avm.part5.ex4.dao.TreasureResourse;
import by.htp.part5.ex4.entity.Cave;
import by.htp.part5.ex4.entity.Dragon;

public class MainTraining {

	public static void main(String[] args) {

		TreasureResourse storage = new TreasureResourse();
		Cave cave = new Cave("cave");

	//	storage.loadTreasureList(cave.getTreasures());
		
		System.out.println(cave.toString());

	}

}
