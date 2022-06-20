package by.avm.part5.ex6.entity;

public class CandyFactory {

	public static Candy createCandyFromFactory(String type) {

		if (type.equalsIgnoreCase("Chocolate")) {
			return new ChoñolateCandy();
		} else if (type.equalsIgnoreCase("Caramel")) {
			return new CaramelCandy();
		} else if (type.equalsIgnoreCase("Trufel")) {
			return new TrufelCandy();
		} else {
			System.out.println("next time choose real candy");
			return null;
		}
	}

}
