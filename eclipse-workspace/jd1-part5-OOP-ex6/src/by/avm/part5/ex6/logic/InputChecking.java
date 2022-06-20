package by.avm.part5.ex6.logic;

public class InputChecking {

	public static String inCandyChecking(String input) {
		
		boolean result = input.toUpperCase().matches("CARAMEL|CHOCOLATE|TRUFEL");

		if(result) {
			return input;
		}else {
			System.out.println("you better choose real candy from our factory next time");
		return null;
		}
	}
	
	public static String inWrapperChecking(String input) {
		
		boolean result = input.toUpperCase().matches("PAPER|PLASTIC");

		if(result) {
			return input;
		}else {
			System.out.println("you better choose real wrapper from our factory next time");
		return null;
		}
	}
	
	
}
