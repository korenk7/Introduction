package by.javacourse.module1.cycles;

import java.util.Scanner;

public class Task7 {
	// Для каждого натурального числа в промежутке m и n вывести все делители,
	// кроме единицы и самого числа. m и n вводятся с клавиатуры

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int m;
		int n;

		String str;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 'm' value");
		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}
		m = sc.nextInt();

		System.out.println("enter 'n' value");
		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}
		n = sc.nextInt();

		if (n < m) {
			int temp = m;
			m = n;
			n=temp;
		}

		for (int i = m; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print("m = " + i + " ");
					System.out.println("j = " + j);

				}
			}
		}
	}

}
