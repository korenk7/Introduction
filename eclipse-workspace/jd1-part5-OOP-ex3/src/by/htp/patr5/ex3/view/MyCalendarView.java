package by.htp.patr5.ex3.view;

import java.util.Scanner;

import by.htp.part5.ex3.entity.My�alendar;

public class MyCalendarView {
	int checkValue;
	Scanner sc = new Scanner(System.in);
	

	public My�alendar calendarCreating() {
		System.out.println("give me year between 1978 and 2048 to create calendar");
		checkValue = sc.nextInt();
		while (checkValue < 1978 || checkValue > 2048) {
			System.out.println("Wrong! "+checkValue);
			
			calendarCreating();
		}
		int year = checkValue;
		My�alendar calendar = new My�alendar(year);
		return calendar;
	}

}
