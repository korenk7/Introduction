package by.javacourse.module1.linear;

import java.util.*;

//Для области составить линейную программу, которая печатает слово true, если точка с координатами
//(x,y) принадлежит закрашенной области, и false -  в противном случае:

public class Task6 {

	public static void main(String[] args) {

		// cut area into 2 parts
		double x1; // for 1 part
		double y1;
		double x2;
		double y2;

		double t1; // for 2 part
		double t2;
		double r1;
		double r2;

		double dotx = 0;
		double doty = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("give me x");
		while(!sc.hasNextDouble()) {
			System.out.println("Please, enter double value "+sc.next()+" is not a double");
		}
			dotx = sc.nextDouble();

		System.out.println("give me y");

		while(!sc.hasNextDouble()) {
			System.out.println("Please, enter double value "+sc.next()+" is not a double");
		}
			doty = sc.nextDouble();

		x1 = -4;
		y1 = -3;
		x2 = 4;
		y2 = 0;

		t1 = -2;
		r1 = 0;
		t2 = 2;
		r2 = 4;

		if (dotx >= x1 && dotx <= x2 && doty >= y1 && doty <= y2) {
			System.out.println("true");
		}

		else if (dotx >= t1 && dotx <= t2 && doty >= r1 && doty <= r2) {
			System.out.println("true");
		}

		else {
			System.out.println("false");
		}
		
	}

}
