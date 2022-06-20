package by.javacourse.module1.cycles;

// напишите программу где пользователь вводит целое положительное число, а программа суммирует
// все числа от 1 до введённого пользователем числа.  

import java.util.*;

public class Task1 {
	@SuppressWarnings("resource")
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int x;
		int sum = 0;

		System.out.println("ââåäèòå öåëîå ïîëîæèòåëüíîå ÷èñëî");

		x = sc.nextInt();
		x = positiveChecking(x);

		for (int i = 1; i <= x; i++) {
			sum = sum + i;
		}

		System.out.println("ñóììà ÷èñåë " + sum);

	}

	public static int positiveChecking(int x) {
		int value = x;
		while (value < 0) {
			System.out.println("value must be positive, enter new X");
			value = sc.nextInt();
		}
		return value;

	}

}
