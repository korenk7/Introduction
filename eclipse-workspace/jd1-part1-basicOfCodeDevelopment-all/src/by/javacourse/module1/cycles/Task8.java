package by.javacourse.module1.cycles;


import java.util.Scanner;

public class Task8 {
	// Даны два числа. Определить цифры входящие в состав как первого так и второго
	// числа

	public static void main(String[] args) {

		int a;
		int b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first int");
		a = sc.nextInt();
		
		System.out.println("enter second int");
		b = sc.nextInt();
		
		
		int[] arr = new int[10];
		
		while (a != 0) {
			arr[a % 10]++;
			a /= 10;
		}
		
		while (b != 0) {
			if (arr[b % 10] != 0)
				System.out.println(b % 10);
			b /= 10;
		}
	}

}
