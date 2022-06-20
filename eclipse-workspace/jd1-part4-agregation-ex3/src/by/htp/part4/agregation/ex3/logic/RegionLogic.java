package by.htp.part4.agregation.ex3.logic;


import by.htp.part4.agregation.ex3.entity.District;
import by.htp.part4.agregation.ex3.entity.Region;

public class RegionLogic {
	
	public void pushDistrict(Region region, District district) {
		region.getDistricts().add(district);
		region.setArea(region.getArea()+district.getArea());
	}

}
