package by.avm.part5.ex6.entity;

public class WrapperFactory {
	
	
	public static Wrapper createWrapperFromFactory(String type) {

		if (type.equalsIgnoreCase("paper")) {
			return new PaperWrapper();
		} else if (type.equalsIgnoreCase("plastic")) {
			return new PlasticWrapper();
		} else {
			System.out.println("next time choose real wrapper");
			return null;
		}
	}

}
