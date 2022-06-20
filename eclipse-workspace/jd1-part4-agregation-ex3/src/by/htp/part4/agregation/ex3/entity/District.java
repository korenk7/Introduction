package by.htp.part4.agregation.ex3.entity;

import java.util.ArrayList;

public class District {
	
	String name;
	ArrayList<City> Citys = new ArrayList<City>();
	int area;
	
	
	public District(String name, int area) {
		super();
		this.name = name;
		this.area = area;
	}

	

	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}







	@Override
	public String toString() {
		return "District [name=" + name + ", Citys=" + Citys + ", area=" + area + "]";
	}
	
	
	
	
	

}
