package by.javacourse.module2.twodimensionalarray;

import java.util.Scanner;

public class Task10 {
	// Ќайти положительные элементы главной диагонали квадратной матрицы
	public static void main(String[] args) {
		int[][] array;
		int numOfelements;
	

		System.out.println("give me numOfLines");
		numOfelements = console();

		array = new int[numOfelements][numOfelements];
	
		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfelements; j++) {
				array[i][j] = (int) (Math.random() * 100 - 50);
			}
		}
		
		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfelements; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < numOfelements; i++) {
			for (int j = 0; j < numOfelements; j++) {
				if (i == j && array[i][j] > 0)
					System.out.println("array[" + (i+1) + "][" + (j+1) + "]" + array[i][j] + "is positive");
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