package by.htp.part4.agregatiom.ex5.main;

import java.util.Scanner;

import by.htp.part4.agregatiom.ex5.entity.TouristVoucher;
import by.htp.part4.agregatiom.ex5.entity.TouristVouchers;
import by.htp.part4.agregatiom.ex5.entity.TypeOfEating;
import by.htp.part4.agregatiom.ex5.entity.TypeOfTransport;
import by.htp.part4.agregatiom.ex5.entity.TypeOfVoucher;
import by.htp.part4.agregatiom.ex5.entity.VoucherStatus;
import by.htp.part4.agregatiom.ex5.logic.VouchersLogic;
import by.htp.part4.agregatiom.ex5.view.VouchersView;

public class Main {

	public static void main(String[] args) {

		TouristVouchers touristVouchers = new TouristVouchers(1);
		VouchersLogic vousLogic = new VouchersLogic();
		VouchersView vousView = new VouchersView();

		TouristVoucher vau1 = new TouristVoucher("Rest&Spa","Italy",TypeOfVoucher.Rest,TypeOfTransport.Avia,TypeOfEating.All_Inclusive,10,2500,VoucherStatus.Visible);
		TouristVoucher vau2 = new TouristVoucher("Hampton","France",TypeOfVoucher.Shoping,TypeOfTransport.Avia,TypeOfEating.Breakfasts,7,2900, VoucherStatus.Visible);
		TouristVoucher vau3 = new TouristVoucher("Willing Hotel","Bulgaria",TypeOfVoucher.Rest,TypeOfTransport.Bus,TypeOfEating.Breakfasts_dinners,10,1700, VoucherStatus.Visible);
		TouristVoucher vau4 = new TouristVoucher("Swejk Hotel","Chesh Rep",TypeOfVoucher.Therapy,TypeOfTransport.Train,TypeOfEating.Breakfasts,7,2300,VoucherStatus.Visible);
		TouristVoucher vau5 = new TouristVoucher("Hotel On SHip","Italy",TypeOfVoucher.Cruise,TypeOfTransport.Ship,TypeOfEating.All_Inclusive,11,4800,VoucherStatus.Visible);
		TouristVoucher vau6 = new TouristVoucher("Willareal","Spain",TypeOfVoucher.Rest,TypeOfTransport.Bus,TypeOfEating.Breakfasts_dinners,8,1900,VoucherStatus.Visible);
		TouristVoucher vau7 = new TouristVoucher("Swaziswazi","Swizzerland",TypeOfVoucher.Excursions,TypeOfTransport.Train,TypeOfEating.Breakfasts,7,7800,VoucherStatus.Visible);
		TouristVoucher vau8 = new TouristVoucher("Hoshimin Hotel","Vietnam",TypeOfVoucher.Excursions,TypeOfTransport.Avia,TypeOfEating.All_Inclusive,11,4800,VoucherStatus.Visible);
		
		vousLogic.pushNewVoucher(touristVouchers, vau1);
		vousLogic.pushNewVoucher(touristVouchers, vau2);
		vousLogic.pushNewVoucher(touristVouchers, vau3);
		vousLogic.pushNewVoucher(touristVouchers, vau4);
		vousLogic.pushNewVoucher(touristVouchers, vau5);
		vousLogic.pushNewVoucher(touristVouchers, vau6);
		vousLogic.pushNewVoucher(touristVouchers, vau7);
		vousLogic.pushNewVoucher(touristVouchers, vau8);
		
		
		vousView.showMenu();
		vousView.menuChoise(touristVouchers);
		
		
	}
}
