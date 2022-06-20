package by.htp.part4.agregation.ex3.logic;

import by.htp.part4.agregation.ex3.entity.Country;
import by.htp.part4.agregation.ex3.entity.Region;

public class CountryLogic {
	
	
	public void pushRegion(Country country, Region region) {
		country.getRegions().add(region);
		country.setArea(country.getArea()+region.getArea());
	}
	
	
	


}
