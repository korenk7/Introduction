package by.javacourse.module4.classestask4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Train[] trainList = new Train[5];
		
		trainList[0] = new Train("Brest", 307, "12:20");
		trainList[1] = new Train("Minsk", 603, "12:40");
		trainList[2] = new Train("Moskow", 22, "08:05");
		trainList[3] = new Train("Brest", 141, "03:14");
		trainList[4] = new Train("Pinsk", 87, "15:46");

		for (int i = 0; i < trainList.length; i++) {
			System.out.println(trainList[i].toString());

		}
		System.out.println("-------------------");

		// Сортируем массив по номеру поезда при помощи компоратора
		Arrays.sort(trainList, Train.TrainNumberComparator);
		System.out.println("-------------------");
		// Сортируем массив по номеру поезда при помощи компоратора созданного через класс 
		TrainComparator comparator = new TrainComparator();
		Arrays.sort(trainList, comparator);
		

		for (int i = 0; i < trainList.length; i++) {
			System.out.println(trainList[i].toString());

		}
		System.out.println("-------------------");

		trainNumberChecking(trainList);
		
		System.out.println("-------------------");

		// Сортируем массив по пункту назначения а затем по времени прибытия
		Arrays.sort(trainList, Train.StationNameComparator);
		
		for (int i = 0; i < trainList.length; i++) {
			System.out.println(trainList[i].toString());

		}
		System.out.println("-------------------");
		
		
		
	}

	public static void trainNumberChecking(Train[] trainList) {

		System.out.println("Please enter train number");
		int trainCheckingNumber = console();
		int indexOfTrain = 0;

		for (int i = 0; i < trainList.length; i++) {
			if (trainList[i].getTrainNumber() == trainCheckingNumber) {
				indexOfTrain = i;
			}
		}
		if (indexOfTrain != 0) {
			System.out.println(trainList[indexOfTrain].toString());
		} else {
			System.out.println("There is no trains with this number, try to enter another value");
			trainNumberChecking(trainList);
		}

	}

	public static int console() {

		String str;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}

		return sc.nextInt();

	}

}
