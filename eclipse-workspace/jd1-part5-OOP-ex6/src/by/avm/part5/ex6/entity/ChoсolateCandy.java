package by.avm.part5.ex6.entity;

public class ChoñolateCandy extends Candy {
	
	public ChoñolateCandy() {
		setName("ChoñolateCandy");
		setCost(100);
		setWeight(24);
	}

	
	@Override
	public void candyIdentification() {
		System.out.println("There is Chocolate Candy");
	}

	
}
