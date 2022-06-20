

/* Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
Методы: ехать, заправляться, менять колесо, вывести на консоль марку ав-
томобиля. */

package by.htp.part4.agregation.ex2.main;

import by.htp.part4.agregation.ex2.entity.Car;
import by.htp.part4.agregation.ex2.entity.Engine;
import by.htp.part4.agregation.ex2.entity.Wheel;
import by.htp.part4.agregation.ex2.logic.CarLogic;
import by.htp.part4.agregation.ex2.view.CarView;

public class Main {

	public static void main(String[] args) {
		
		Wheel wheel1 = new Wheel();
		Wheel wheel2 = new Wheel();
		Wheel wheel3 = new Wheel();
		Wheel wheel4 = new Wheel();
		
		
		Engine engine = new Engine();
		
		CarLogic carlogic = new CarLogic();
		CarView carview = new CarView();
		
		Car car = new Car(wheel1,wheel2,wheel3,wheel4,engine,"Skoda");
		
		carview.printCarName(car);
		
		carview.printCarInfo(car);
		carlogic.ride(car);
		carview.printCarInfo(car);
		carlogic.ride(car);
		carview.printCarInfo(car);
		carlogic.refuel(car);
		carview.printCarInfo(car);
		
		carlogic.badRoadWheelChanging(car);
		carview.printCarInfo(car);
		carlogic.ride(car);
		carview.printCarInfo(car);
		
		


		
		

	}

}
