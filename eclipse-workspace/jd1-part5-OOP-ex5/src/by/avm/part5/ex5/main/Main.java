package by.avm.part5.ex5.main;

import java.util.Scanner;

import by.avm.part5.ex5.entity.Composition;
import by.avm.part5.ex5.entity.FlowerFactory;
import by.avm.part5.ex5.entity.Wrapper;
import by.avm.part5.ex5.logic.CompositionLogic;
import by.avm.part5.ex5.logic.InputLogic;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		CompositionLogic compLogic = new CompositionLogic();

		showMenu();
		chooseMenu(1, compLogic);
		chooseMenu(2, compLogic);
		chooseMenu(3, compLogic);
	}

	
	public static void showMenu() {
		System.out.println("Choose what do you want to do");
		System.out.println("1 to choose flowers");
		System.out.println("2 to check the composition");
		System.out.println("3 to buy a composition");
	}

	public static void chooseMenu(int value, CompositionLogic compLogic) {
		
		switch (value) {

		case 1:
			FlowerFactory flowFactory = new FlowerFactory();
			System.out.println("enter flow you want to buy");
			String flow = sc.next();
			InputLogic inLogic = new InputLogic();
			compLogic.setFlower(flowFactory.createFlower(inLogic.inputChecking(flow)));
			
			break;
			
		case 2:
			
			compLogic.setComp(new Composition(compLogic.getFlower(),new Wrapper()));
			System.out.println("your order is");
			System.out.println(compLogic.getComp().toString());
			
			break;
		case 3:
			
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			System.out.println("1 - " + compLogic.getComp().getFlower().toString()+" = "+compLogic.getComp().getFlower().getPrice());
			System.out.println("2 - " + compLogic.getComp().getWrapper()+" = "+compLogic.getComp().getWrapper().getPrice());
			System.out.println("----------------------------------");
			System.out.println("Summ = "+compLogic.getComp().getPrice());
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			break;
		}

	}

}
