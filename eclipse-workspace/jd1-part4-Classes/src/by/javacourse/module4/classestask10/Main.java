package by.javacourse.module4.classestask10;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		AirlineContainer airlinecontainer = new AirlineContainer(1);

		Airline airline1 = new Airline("Tbilisi", "T615", "TU104", "14:04", "friday");
		Airline airline2 = new Airline("Warszawa", "W01", "Airbus", "19:09", "saturday");
		Airline airline3 = new Airline("Tbilisi", "V15", "Boeing", "11:44", "sunday");
		Airline airline4 = new Airline("Moskow", "M999", "TU104", "23:34", "monday");
		Airline airline5 = new Airline("Madrid", "M711", "S7", "08:19", "thursday");
		Airline airline6 = new Airline("Minsk", "M711", "S7", "08:19", "thursday");
		Airline airline7 = new Airline("Madagaskar", "M711", "S7", "08:19", "thursday");
		Airline airline8 = new Airline("Kiiv", "M711", "S7", "08:19", "thursday");
		Airline airline9 = new Airline("Berlin", "M711", "S7", "08:19", "thursday");

		// System.out.println(airline1.toString());

		airlinecontainer.pushAirline(airline1);
		airlinecontainer.pushAirline(airline2);
		airlinecontainer.pushAirline(airline3);
		airlinecontainer.pushAirline(airline4);
		airlinecontainer.pushAirline(airline5);
		airlinecontainer.pushAirline(airline6);
		airlinecontainer.pushAirline(airline7);
		airlinecontainer.pushAirline(airline8);
		airlinecontainer.pushAirline(airline9);

		airlinecontainer.printAirline();

		menuPrint();
		choosingMenu(sc.nextInt(), airlinecontainer);

	}

	public static void menuPrint() {
		System.out.println("Menu of airlines information");
		System.out.println("please choose operation");
		System.out.println("1 - search by destination point");
		System.out.println("2 - search by day of week");
		System.out.println("3 - search by day of week, where time of week is more");
		System.out.println("0 - end of program");
	}

	public static void choosingMenu(int num, AirlineContainer airlinecontainer) {

		switch (num) {
		case 1:
			System.out.println("Choosing by destination point");
			airlinecontainer.printDestinationPoints();
			airlinecontainer.findAirlineByDestinationPoint(sc.nextInt());
			menuPrint();
			choosingMenu(sc.nextInt(), airlinecontainer);
			
		case 2:
			System.out.println("Choosing by day of week");
			airlinecontainer.printDaysOfWeek();
			airlinecontainer.findAirlineByDayOfWeek(sc.nextInt());
			menuPrint();
			choosingMenu(sc.nextInt(), airlinecontainer);
			
		case 3:
			System.out.println("Choosing by day of week and time");
			airlinecontainer.printDaysOfWeek();
			airlinecontainer.findAirlineByDayOfWeekAndTime(sc.nextInt());
			menuPrint();
			choosingMenu(sc.nextInt(), airlinecontainer);
			
		}
		
	
	}

	
}


