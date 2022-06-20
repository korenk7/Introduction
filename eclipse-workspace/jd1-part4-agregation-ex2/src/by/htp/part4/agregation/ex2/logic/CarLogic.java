package by.htp.part4.agregation.ex2.logic;



import by.htp.part4.agregation.ex2.entity.Car;

public class CarLogic {

	public void ride(Car car) {
		if (car.getFuelInTank() > 0) {
			System.out.println("wroom-wroom");
			fuelLevelDown(car);
		} else {
			System.out.println("It's now enought fuel for ride");
		}
	}

	public void refuel(Car car) {

		if (car.getFuelInTank() < 100) {
			System.out.println("+ 20 liters");
			car.setFuelInTank(car.getFuelInTank() + 20);
		} else {
			System.out.println("it's enought fuel in a tank");
		}

	}

	public static void fuelLevelDown(Car car) {
		int value = car.getFuelInTank();
		if (value - 20 > 0) {
			car.setFuelInTank(value - 20);
		} else {
			car.setFuelInTank(0);
		}
	}

	public void badRoadWheelChanging(Car car) {
		
		System.out.println("We need to change the wheel");

		int rand = 1 + (int) (Math.random() * 4);
		
		switch(rand) {
		
		case 1:
			car.setWheel1(car.getSparedWheel());
			break;
		case 2:
			car.setWheel2(car.getSparedWheel());
			break;
		case 3:
			car.setWheel3(car.getSparedWheel());
			break;
		case 4:
			car.setWheel4(car.getSparedWheel());
			break;
			
		}
		
		

	}

}
