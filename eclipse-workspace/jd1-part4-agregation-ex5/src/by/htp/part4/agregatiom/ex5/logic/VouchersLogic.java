package by.htp.part4.agregatiom.ex5.logic;

import java.util.Scanner;

import by.htp.part4.agregatiom.ex5.entity.TouristVoucher;
import by.htp.part4.agregatiom.ex5.entity.TouristVouchers;

public class VouchersLogic {
	Scanner sc = new Scanner(System.in);

	public void pushNewVoucher(TouristVouchers touristVouchers, TouristVoucher voucher) {

		TouristVoucher[] temp;

		if (touristVouchers.getSize() < touristVouchers.getCapacity()) {

			touristVouchers.getVouchers()[touristVouchers.getSize()] = voucher;
			touristVouchers.setSize(touristVouchers.getSize() + 1);

		} else {
			temp = new TouristVoucher[touristVouchers.getCapacity()];
			temp = touristVouchers.getVouchers();

			touristVouchers.setVouchers(new TouristVoucher[touristVouchers.getCapacity() * 2]);

			for (int i = 0; i < temp.length; i++) {
				touristVouchers.getVouchers()[i] = temp[i];
			}
			touristVouchers.getVouchers()[touristVouchers.getSize()] = voucher;
			touristVouchers.setSize(touristVouchers.getSize() + 1);
			touristVouchers.setCapacity(touristVouchers.getCapacity() * 2);

		}

	}
	
	

	

}
