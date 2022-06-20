package by.avm.part5.ex6.main;

import java.util.Scanner;

import by.avm.part5.ex6.entity.Candy;
import by.avm.part5.ex6.entity.CandyFactory;
import by.avm.part5.ex6.entity.Present;
import by.avm.part5.ex6.entity.Wrapper;
import by.avm.part5.ex6.entity.WrapperFactory;
import by.avm.part5.ex6.logic.InputChecking;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome in our present shop");
		System.out.println("Please choose candy");
		Candy realCandy = CandyFactory.createCandyFromFactory(InputChecking.inCandyChecking(sc.nextLine()));
		System.out.println("Please choose wrapper");
		Wrapper realWrapper = WrapperFactory.createWrapperFromFactory(InputChecking.inWrapperChecking(sc.nextLine()));
		
		Present present = new Present(realCandy,realWrapper);
		System.out.println("Your present is");
		System.out.println(present.toString());
		
		
		
		
	}

}
