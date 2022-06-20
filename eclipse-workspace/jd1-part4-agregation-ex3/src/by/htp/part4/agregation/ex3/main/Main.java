/*Создать объект класса Государство, используя классы Область, Район,
Город. Методы: вывести на консоль столицу, количество областей, пло-
щадь, областные центры.*/

package by.htp.part4.agregation.ex3.main;

import by.htp.part4.agregation.ex3.entity.City;
import by.htp.part4.agregation.ex3.entity.Country;
import by.htp.part4.agregation.ex3.entity.District;
import by.htp.part4.agregation.ex3.entity.Region;
import by.htp.part4.agregation.ex3.logic.CountryLogic;
import by.htp.part4.agregation.ex3.logic.RegionLogic;
import by.htp.part4.agregation.ex3.view.CountryView;

public class Main {

	public static void main(String[] args) {

		CountryLogic logic = new CountryLogic();
		CountryView view = new CountryView();
		RegionLogic rLogic = new RegionLogic();

		District district1 = new District("Pruzanski", 2860);
		District district2 = new District("Brestskij", 1413);
		District district3 = new District("Lidskij", 1567);
		District district4 = new District("Grodnenskij", 1668);

		Region region1 = new Region("Brestskaya", new City("Brest"));
		Region region2 = new Region("Grodnenskaya", new City("Grodno"));

		rLogic.pushDistrict(region1, district1);
		rLogic.pushDistrict(region1, district2);
		rLogic.pushDistrict(region2, district3);
		rLogic.pushDistrict(region2, district4);

		Country country = new Country("Belarus");
		country.setCapital(new City("Minsk"));

		logic.pushRegion(country, region1);
		logic.pushRegion(country, region2);

		view.showCapital(country);
		view.showRegions(country);
		view.showArea(country);
		view.showRegionCentres(country);

	}

}
