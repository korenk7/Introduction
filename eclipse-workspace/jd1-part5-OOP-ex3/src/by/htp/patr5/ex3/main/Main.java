package by.htp.patr5.ex3.main;


import by.htp.part5.ex3.entity.My�alendar;
import by.htp.patr5.ex3.view.MyCalendarView;

// ������� ����� ��������� � ���������� �������, � ������� �������� ��������, ����� �������
// ���������� � �������� � ����������� ����

public class Main {

	public static void main(String[] args) {
		

		MyCalendarView view = new MyCalendarView();
		My�alendar calendar = view.calendarCreating();
		
		
		calendar.addDayOff(calendar.dayOffCreating());
		calendar.addDayOff(calendar.dayOffCreating());
		System.out.println(calendar.toString());

		calendar.addDayOff(calendar.dayOffCreating());
		calendar.addDayOff(calendar.dayOffCreating());
		
		System.out.println(calendar.toString());
		

	}

}
