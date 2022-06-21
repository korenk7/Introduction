package by.javacourse.module2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	// Заданы два одномерных массива с различным количеством элементов и натуральное
	// число k. Объединить их в один массив
	// включив второй массив между К и К+1 элементами первого, при этом не используя
	// доп. массив

	public static void main(String[] args) {
		int array1[];
		int array2[];
		int coupleArray[];
		int k;

		int n1;
		int n2;

		System.out.println("Введите количество элементов первого массива n1");
		n1 = console();

		System.out.println("Введите количество элементов второго массива n2");
		n2 = console();

		System.out.println("Введите номер элемента k");
		k = elementchecking(n1);

		array1 = new int[n1];
		array2 = new int[n2];
		coupleArray = new int[n1 + n2];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) (Math.random() * 10);
		}

		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(k);

		for (int i = 0; i < k; i++) {
			coupleArray[i] = array1[i];
		}

		for (int i = k; i < k + array2.length; i++) {
			coupleArray[i] = array2[i - k];
		}

		for (int i = k + array2.length; i < coupleArray.length; i++) {
			coupleArray[i] = array1[i - array2.length];
		}

		System.out.println(Arrays.toString(coupleArray));

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

	public static int elementchecking(int n) {

		String str;
		int rightInt;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}

		do {
			System.out.println("Enter a number from 0 to " + (n - 1));
			rightInt = sc.nextInt();
		} while (rightInt > (n - 1));

		return rightInt;

	}

}
