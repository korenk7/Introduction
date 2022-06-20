package by.javacourse.module2.onedimenarray;

import java.util.Scanner;

public class Task4 {
	// Даны действительные числа а1, а2, а3, аn. Поменять местами наименьший и
	// наибольший элементы массива.

	public static void main(String[] args) {
		int array[];
		int n;
		int max;
		int min;
		int indexofmax;
		int indexofmin;
		

		System.out.println("Введите количество элементов массива");
		n = console();

		array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100 - 50);

			System.out.println("a" + i + " = " + array[i] + " ");
		}
		System.out.println();
		
		max = array[0];
		min = array[0];
		indexofmax = 0;
		indexofmin = 0;

		for (int i = 0; i < n; i++) {
			if (array[i] > max) {
				max=array[i];
				indexofmax = i;
			}
			
			if (array[i] < min) {
				min=array[i];
				indexofmin = i;
			}

		}
		
		System.out.println("max a = a["+indexofmax+"] = "+ max);
		System.out.println("min a = a["+indexofmin+"] = "+ min);
		System.out.println();
		
	
		array[indexofmax]=min;
		array[indexofmin]=max;
		
		for (int i = 0; i < n; i++) {

			System.out.println("a" + i + " = " + array[i] + " ");
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
