package by.javacourse.module4.classestask6;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time();
		
		System.out.println("Задайте значение времени");
		System.out.println("Задайте часы");
		time.setHour(console());
		System.out.println("Задайте минуты");
		time.setMin(console());
		System.out.println("Задайте секунды");
		time.setSec(console());
		
		System.out.println(time.toString());
		menuPrint();
		menuChoice(console(),time);

	}
	
	public static void menuChoice(int numMenu, Time time) {

		switch (numMenu) {
		case 1:
			System.out.println("Задайте новое значение часов");
			time.setHour(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;

		case 2:
			System.out.println("Задайте новое значение минут");
			time.setMin(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 3:
			System.out.println("Задайте новое значение секунд");
			time.setSec(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 4:
			System.out.println("Сколько часов добавить?");
			time.addHour(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 5:
			System.out.println("Сколько минут добавить?");
			time.addMin(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
			
		case 6:
			System.out.println("Сколько секунд добавить?");
			time.addSec(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
			
		case 7:
			System.out.println("Сколько часов отнять?");
			time.reduceHour(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 8:
			System.out.println("Сколько минут отнять?");
			time.reduceMin(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 9:
			System.out.println("Сколько секунд отнять?");
			time.reduceSec(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;

		default:
			System.out.println("Не понятно!");
		}
	}
	
	public static void menuPrint() {
		System.out.println("Изменить значение времени ");
		System.out.println("1 - Изменить количество часов");
		System.out.println("2 - Изменить количество минут");
		System.out.println("3 - Изменить количество секунд");
		System.out.println("4 - Добавить часов");
		System.out.println("5 - Добавить минут");
		System.out.println("6 - Добавить секунд");
		System.out.println("7 - Убрать часов");
		System.out.println("8 - Убрать минут");
		System.out.println("9 - Убрать секунд");
	}
	
	//проверка введенного значения int 
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
