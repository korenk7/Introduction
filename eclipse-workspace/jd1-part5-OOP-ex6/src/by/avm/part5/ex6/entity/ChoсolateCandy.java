package by.avm.part5.ex6.entity;

public class Cho�olateCandy extends Candy {
	
	public Cho�olateCandy() {
		setName("Cho�olateCandy");
		setCost(100);
		setWeight(24);
	}

	
	@Override
	public void candyIdentification() {
		System.out.println("There is Chocolate Candy");
	}

	
}
