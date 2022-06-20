package by.javacourse.module4.classestask1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Test1 test = new Test1();
		Scanner sc = new Scanner(System.in);

		System.out.println("some x1 = ");
		test.setX1(sc.nextInt());
		
		System.out.println("some x2 = ");
		test.setX2(sc.nextInt());
		
		test.printValues();
		System.out.println(test.getBigger());
		

	}

}
