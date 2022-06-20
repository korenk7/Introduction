package by.avm.part5.ex5.entity;

public class Tulip extends Flower{
	
	public Tulip() {
		setName("Tulip");
		setPrice(90);
		setColor("Yellow");
	}

	@Override
	public void flowerIdentification() {
		System.out.println("this is the Tulip");
	}


	
	

}
