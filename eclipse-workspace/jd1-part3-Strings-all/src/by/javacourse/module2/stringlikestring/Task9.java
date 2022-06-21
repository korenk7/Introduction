package by.javacourse.module2.stringlikestring;

import java.util.Scanner;

public class Task9 {
	// Посчитать количество строчных(маленьких) и прописных(больших) букв в веденной
	// строке. Учитывать только английские буквы
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the line for checking");
		String str = new String(sc.nextLine());

		int countOfUpper = 0;
		int countOfDown = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 64 && str.charAt(i) < 91) {
				countOfUpper++;
			}

			if (str.charAt(i) > 97 && str.charAt(i) < 122) {
				countOfDown++;
			}
		}
		System.out.println("count of uppercase letters = " + countOfUpper);
		System.out.println("count of downcase letters = " + countOfDown);
	}

}
