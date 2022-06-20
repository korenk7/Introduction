package by.avm.part5.ex5.logic;

public class InputLogic {

	public String inputChecking(String input) {

		boolean result = input.matches("rose|tulip");

		if (result) {
			return input;
		} else
			System.out.println("You better choose between rose and tulip");
		return null;

	}

}
