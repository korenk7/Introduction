package by.avm.part5.ex5.entity;

public class Rose extends Flower{
	
	public Rose() {
		setName("Rose");
		setPrice(100);
		setColor("Red");
	}

	@Override
	public void flowerIdentification() {
		System.out.println("this is the Rose");
	}


	

}
