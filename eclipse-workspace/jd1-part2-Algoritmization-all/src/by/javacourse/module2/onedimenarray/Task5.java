package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

//Даны целые числа а1, а2, а3... аn
//Вывести на печать те числа, для которых an>n

public class Task5 {

	public static void main(String[] args) {

		int array[];
		int n;

		System.out.println("Введите количество элементов массива");
		n = console();

		array = new int[n];

		for (int i = 0; i < n; i++) {

			array[i] = (int) (Math.random() * 100 - 50);

			if (array[i] > i) {
				System.out.println("a" + i + " = " + array[i] + " ");
			}
		}

	}

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
