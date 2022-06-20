package by.htp.part4.agregatiom.ex5.view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import by.htp.part4.agregatiom.ex5.entity.TouristVoucher;
import by.htp.part4.agregatiom.ex5.entity.TouristVouchers;
import by.htp.part4.agregatiom.ex5.entity.VoucherStatus;


public class VouchersView {
	Scanner sc = new Scanner(System.in);

	public void showMenu() {
		System.out.println("Travelling shop is working");
		System.out.println("Press number what you want to do");
		System.out.println();
		System.out.println("Choose 1 for searching by transport");
		System.out.println("Choose 2 for searching by eating");
		System.out.println("Choose 3 for searching by days");
		System.out.println("Choose 4 for sorting by hotel name");
		System.out.println("Choose 5 for sorting by country");
		System.out.println("Choose 6 for booking");
	}
	
	public void intChecking() {
		while (!sc.hasNextInt()) {
			String menuChoise = sc.next();
			System.out.println(menuChoise + " is not Integer");
			System.out.println();
			showMenu();
		}
	}


	public void menuChoise(TouristVouchers touristVouchers) {
		intChecking();
		int choise = sc.nextInt();

		switch (choise) {

		case 1:

			System.out.println("Enter transport you want to search with");
			System.out.println("bus, avia, train or ship");
			String typeOfTransport = sc.next();
			typeOfTransport = firstUpperCase(typeOfTransport);
			int countOfVauchers = 0;

			for (int i = 0; i < touristVouchers.getSize(); i++) {
				if (touristVouchers.getVouchers()[i].getTransportType().toString().equals(typeOfTransport)) {
					countOfVauchers++;
					System.out.println(touristVouchers.getVouchers()[i].toString());
				}
			}

			if (countOfVauchers == 0) {
				System.out.println("There is no Vouchers with your parametrs");
			}
			countOfVauchers = 0;
			System.out.println();
			showMenu();
			menuChoise(touristVouchers);

			break;
			
		case 2:

			System.out.println("Enter eating type you want to search with");
			System.out.println("Choose 1 for All Inclusive search");
			System.out.println("Choose 2 for Breakfasts search");
			System.out.println("Choose 3 for Breakfasts & dinners search");

			intChecking();
			int eatingChoise = sc.nextInt();

			while (eatingChoise < 1 || eatingChoise > 3) {

				System.out.println("choise must be from 1 to 3");
				System.out.println();
				showMenu();
				menuChoise(touristVouchers);
			}
			if (eatingChoise == 1) {
				for (int i = 0; i < touristVouchers.getSize(); i++) {
					if (touristVouchers.getVouchers()[i].getEatingType().toString().equals("All_Inclusive")) {
						System.out.println(touristVouchers.getVouchers()[i].toString());
					}
				}
			} else if (eatingChoise == 2) {
				for (int i = 0; i < touristVouchers.getSize(); i++) {
					if (touristVouchers.getVouchers()[i].getEatingType().toString().equals("Breakfasts")) {
						System.out.println(touristVouchers.getVouchers()[i].toString());
					}
				}

			} else {
				for (int i = 0; i < touristVouchers.getSize(); i++) {
					if (touristVouchers.getVouchers()[i].getEatingType().toString().equals("Breakfasts_dinners")) {
						System.out.println(touristVouchers.getVouchers()[i].toString());
					}
				}
			}

			System.out.println();
			showMenu();
			menuChoise(touristVouchers);

			break;

		case 3:
			
			System.out.println("Enter num of days you want to travel");

			while (!sc.hasNextInt()) {
				String daysChoise = sc.next();
				System.out.println(daysChoise + " is not Integer");
				System.out.println();
				showMenu();
				menuChoise(touristVouchers);
			}
			int dayChoise = sc.nextInt();
			int countOfVauchersDaySearch = 0;
			for (int i = 0; i < touristVouchers.getSize(); i++) {
				if (touristVouchers.getVouchers()[i].getDaysOfTravelling() == dayChoise) {
					countOfVauchersDaySearch++;
					System.out.println(touristVouchers.getVouchers()[i].toString());
				}
			}
			if (countOfVauchersDaySearch == 0) {
				System.out.println("There is no Vouchers with your parametrs");
			}
			countOfVauchersDaySearch = 0;
			
			System.out.println();
			showMenu();
			menuChoise(touristVouchers);

			break;
			
		case 4:
			Comparator<TouristVoucher> byNameComparator = new VoucherByNameComparator();
			Arrays.sort(touristVouchers.getVouchers(), byNameComparator);
			
			for (int i = 0; i < touristVouchers.getSize(); i++) {

					System.out.println(touristVouchers.getVouchers()[i].toString());
				
			}
			break;
			
		case 5:
			
			Comparator<TouristVoucher> byCountryComparator = new VoucherByCountryComparator();
			Arrays.sort(touristVouchers.getVouchers(), byCountryComparator);
			
			for (int i = 0; i < touristVouchers.getSize(); i++) {

					System.out.println(touristVouchers.getVouchers()[i].toString());
				
			}
			break;
			
			
		case 6:
			System.out.println("Enter ID for booking tour");
			int idBooking = sc.nextInt();
			for (int i = 0; i < touristVouchers.getSize(); i++) {
				if (touristVouchers.getVouchers()[i].getId()==idBooking) {
					touristVouchers.getVouchers()[i].setStatus(VoucherStatus.Booked);
				}
			}
			
			for (int i = 0; i < touristVouchers.getSize(); i++) {
				if (touristVouchers.getVouchers()[i].getStatus().toString().equals("Booked")) {
					System.out.println(touristVouchers.getVouchers()[i].toString());
				}
			}

		default:
			System.out.println("value of choosing need to be from 1 to 5");
			System.out.println();
			showMenu();
			menuChoise(touristVouchers);

		}

	}

	public void printVouchers(TouristVouchers touristVouchers) {
		for (int i = 0; i < touristVouchers.getSize(); i++) {
			System.out.println(touristVouchers.getVouchers()[i].toString());

		}
	}

	public String firstUpperCase(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}

	public void intValidation() {

	}

}

class VoucherByNameComparator implements Comparator<TouristVoucher> {

	@Override
	public int compare(TouristVoucher o1, TouristVoucher o2) {
		// TODO Auto-generated method stub
		return o1.getHotelName().compareTo(o2.getHotelName());
	}

}

class VoucherByCountryComparator implements Comparator<TouristVoucher> {

	@Override
	public int compare(TouristVoucher o1, TouristVoucher o2) {
		// TODO Auto-generated method stub
		return o1.getCountryName().compareTo(o2.getCountryName());
	}

}
