package by.avm.part5.ex5.entity;

public class FlowerFactory {

	public Flower createFlower(String flowerType) {

	//	Flower newFlower = null;

		if (flowerType.equalsIgnoreCase("rose")) {
			return new Rose();
		} else

		if (flowerType.equalsIgnoreCase("tulip")) {
			return new Tulip();

		} else
			System.out.println("you better choose real flower");
			return null;
	}

}
