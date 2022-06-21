package by.javacourse.module2.stringlikestring;

import java.util.Scanner;

public class Task7 {
	// Вводится строка. Требуется удалить из неё все повторяющиеся символы и пробелы
	// (abc cde def) = abcdef
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean coincidence = false;

		System.out.println("Enter the line for checking");
		String str = new String(sc.nextLine());
		String substr = new String();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < substr.length(); j++) {
				if (str.charAt(i) == substr.charAt(j)) {
					coincidence = true;
				}
			}
			if (coincidence == false && str.charAt(i) != ' ') {
				substr += str.charAt(i);
			}
			coincidence = false;
		}

		System.out.println("New string = " + substr);

	}

}
