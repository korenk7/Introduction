package by.javacourse.module1.cycles;

import java.util.Scanner;

public class Task5 {

		// даты числовой ряд и число е.
	// Найти сумму тех членов ряда, модуль которых больше или равен заданному е
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter e value");
		double e = sc.nextDouble();
		double a = 1;
		double sum = 0;

		while (Math.abs(a) > e) {
			n = n + 1;
			a = (1 / Math.pow(2, n)) + 1 / (Math.pow(3, n));
			sum += a;

		}

		System.out.println("summ= " + sum);
		sc.close();

	}

}
