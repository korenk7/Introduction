package by.javacourse.module4.classestask10;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import by.javacourse.module4.classestask4.Train;

public class AirlineContainer {
	private Airline[] airlines;
	private int size;
	private int capacity;
	private Airline[] temp;
	private int key;
	Map<Integer, String> cityes = new HashMap<Integer, String>();
	Map<Integer, String> days = new HashMap<Integer, String>();

	public AirlineContainer(int capacity_) {
		size = 0;
		capacity = capacity_;
		airlines = new Airline[capacity];

	}

	public void pushAirline(Airline airline) {
		if (size < capacity) {
			airlines[size] = airline;
			size++;
		} else {
			temp = new Airline[capacity];
			temp = airlines;

			airlines = new Airline[capacity * 2];
			for (int i = 0; i < temp.length; i++) {
				airlines[i] = temp[i];
			}
			airlines[size] = airline;
			size++;
			capacity = capacity * 2;

		}

		cityes.put(key, airline.getDestinationPoint());
		key++;

	}

	public void printAirline() {
		for (int i = 0; i < size; i++) {
			System.out.println(airlines[i].toString());

		}
	}

	public void printDestinationPoints() {

		for (Map.Entry<Integer, String> item : cityes.entrySet()) {

			System.out.printf("press %d for %s \n", item.getKey(), item.getValue());
		}

	}

	public void findAirlineByDestinationPoint(int index) {

		String city = cityes.get(index);

		for (int i = 0; i < size; i++) {
			if (airlines[i].getDestinationPoint().equals(city)) {
				System.out.println(airlines[i].toString());
			}
		}
	}

	public void printDaysOfWeek() {

		days.put(1, "monday");
		days.put(2, "tuesday");
		days.put(3, "wensday");
		days.put(4, "thursday");
		days.put(5, "friday");
		days.put(6, "saturday");
		days.put(7, "sunday");

		for (Map.Entry<Integer, String> item : days.entrySet()) {

			System.out.printf("press %d for %s \n", item.getKey(), item.getValue());
		}
	}

	public void findAirlineByDayOfWeek(int index) {

		String day = days.get(index);

		for (int i = 0; i < size; i++) {
			if (airlines[i].getDayOfWeek().equals(day)) {
				System.out.println(airlines[i].toString());
			}
		}
	}
	
	public void findAirlineByDayOfWeekAndTime(int index) {
		Scanner sc = new Scanner(System.in);
		
		String day = days.get(index);
		System.out.println("enter time in format HH:MM");
		String time = sc.next();
		
		for (int i = 0; i < size; i++) {
			if (airlines[i].getDayOfWeek().equals(day) && time.compareTo(airlines[i].getTimeOfStart())<0 ) {
				System.out.println(airlines[i].toString());
			}
		}
	}
	
	public static Comparator<Train> TrainNumberComparator = new Comparator<Train>() {

		@Override
		public int compare(Train t1, Train t2) {
			return (int) (t1.getTrainNumber() - t2.getTrainNumber());
		}
	};
	
	
	

}
