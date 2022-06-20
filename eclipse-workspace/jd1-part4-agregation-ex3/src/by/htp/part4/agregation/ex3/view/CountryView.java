package by.htp.part4.agregation.ex3.view;

import by.htp.part4.agregation.ex3.entity.Country;

public class CountryView {

	public void showCapital(Country country) {
		System.out.println("Capital of "+ country.getName() + " is " + country.getCapital().toString());
		System.out.println();
	}

	public void showRegions(Country country) {
		int countOfRegions = country.getRegions().size();

		System.out.println("Quantity of regions = " + countOfRegions);

		for (int i = 0; i < countOfRegions; i++) {
			System.out.println(country.getRegions().get(i).getName());

		}
		
		System.out.println();

	}
	
	public void showRegionCentres(Country country) {
		int countOfRegions = country.getRegions().size();

		System.out.println("Region centres of " + country.getName()+" are");
		for (int i = 0; i < countOfRegions; i++) {
			System.out.println(country.getRegions().get(i).getRegionCentre());

		}

	}

	public void showArea(Country country) {
		System.out.println("Area of all country is = " + country.getArea());
		System.out.println();

	}

}
