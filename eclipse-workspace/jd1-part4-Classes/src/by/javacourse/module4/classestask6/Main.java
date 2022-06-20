package by.javacourse.module4.classestask6;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time();
		
		System.out.println("������� �������� �������");
		System.out.println("������� ����");
		time.setHour(console());
		System.out.println("������� ������");
		time.setMin(console());
		System.out.println("������� �������");
		time.setSec(console());
		
		System.out.println(time.toString());
		menuPrint();
		menuChoice(console(),time);

	}
	
	public static void menuChoice(int numMenu, Time time) {

		switch (numMenu) {
		case 1:
			System.out.println("������� ����� �������� �����");
			time.setHour(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;

		case 2:
			System.out.println("������� ����� �������� �����");
			time.setMin(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 3:
			System.out.println("������� ����� �������� ������");
			time.setSec(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 4:
			System.out.println("������� ����� ��������?");
			time.addHour(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 5:
			System.out.println("������� ����� ��������?");
			time.addMin(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
			
		case 6:
			System.out.println("������� ������ ��������?");
			time.addSec(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
			
		case 7:
			System.out.println("������� ����� ������?");
			time.reduceHour(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 8:
			System.out.println("������� ����� ������?");
			time.reduceMin(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;
			
		case 9:
			System.out.println("������� ������ ������?");
			time.reduceSec(console());
			System.out.println(time.toString());
			menuPrint();
			menuChoice(console(),time);
			break;

		default:
			System.out.println("�� �������!");
		}
	}
	
	public static void menuPrint() {
		System.out.println("�������� �������� ������� ");
		System.out.println("1 - �������� ���������� �����");
		System.out.println("2 - �������� ���������� �����");
		System.out.println("3 - �������� ���������� ������");
		System.out.println("4 - �������� �����");
		System.out.println("5 - �������� �����");
		System.out.println("6 - �������� ������");
		System.out.println("7 - ������ �����");
		System.out.println("8 - ������ �����");
		System.out.println("9 - ������ ������");
	}
	
	//�������� ���������� �������� int 
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
