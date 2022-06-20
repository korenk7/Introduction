package by.htp.patr5.ex3.main;


import by.htp.part5.ex3.entity.MyСalendar;
import by.htp.patr5.ex3.view.MyCalendarView;

// Создать класс Календарь с внутренним классом, с помощью объектов которого, можно хранить
// информацию о выходных и праздничных днях

public class Main {

	public static void main(String[] args) {
		

		MyCalendarView view = new MyCalendarView();
		MyСalendar calendar = view.calendarCreating();
		
		
		calendar.addDayOff(calendar.dayOffCreating());
		calendar.addDayOff(calendar.dayOffCreating());
		System.out.println(calendar.toString());

		calendar.addDayOff(calendar.dayOffCreating());
		calendar.addDayOff(calendar.dayOffCreating());
		
		System.out.println(calendar.toString());
		

	}

}
