package by.htp.part4.agregation.ex2.view;

import by.htp.part4.agregation.ex2.entity.Car;

public class CarView {

	public void printCarInfo(Car car) {

		System.out.println(car.toString());

	}

	public void printCarName(Car car) {

		System.out.println("Brand of this car is " + car.getName());

	}

}
