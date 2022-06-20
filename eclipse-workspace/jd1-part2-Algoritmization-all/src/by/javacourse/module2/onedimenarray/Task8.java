package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

public class Task8 {
	// Дана последовательность чисел а1,а2,...,аn
	// Образовать новую последовательность, выбросив из исходной те члены, которые
	// равны min(а1,а2,...,аn)

	public static void main(String[] args) {
		int array[];
		int newArray[];
		int n;
		int min;
		int countOfMin;

		int indexResult;

		System.out.println("Введите количество элементов массива");
		n = console();

		array = new int[n];
		min = array[0];

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 100 - 50);
			System.out.println("a" + i + " = " + array[i] + " ");

			if (array[i] < min) {
				min = array[i];
			}
		}
		countOfMin = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == min) {
				countOfMin++;
			}
		}
		
		System.out.println();
		System.out.println("min " + min);
		System.out.println("countOfMin " + countOfMin);
		System.out.println();

		newArray = new int[n - countOfMin];
		indexResult = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != min) {
				newArray[indexResult] = array[i];
				System.out.println("new a" + indexResult + " = " + newArray[indexResult] + " ");
				indexResult++;
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
