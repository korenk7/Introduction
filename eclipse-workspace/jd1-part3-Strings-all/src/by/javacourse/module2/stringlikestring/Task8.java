package by.javacourse.module2.stringlikestring;

import java.util.Scanner;

public class Task8 {
	// Вводится строка слов разделенных пробелами. Найти самое длинное слово и
	// вывести его на экран. Случай, когда их может быть несколько, не обрабатывать
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the line for checking");
		String str = new String(sc.nextLine());

		String[] stringArray = str.split(" ");

		int maxLength = 0;
		int indexOfMax = 0;

		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].length() > maxLength) {
				maxLength = stringArray[i].length();
				indexOfMax = i;
			}
		}
		System.out.println("longest word is " + stringArray[indexOfMax]);

	}

}
