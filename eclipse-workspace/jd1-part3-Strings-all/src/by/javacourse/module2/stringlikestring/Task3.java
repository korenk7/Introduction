package by.javacourse.module2.stringlikestring;

public class Task3 {
	// проверить является ли заданное слово палиндромом
	public static void main(String[] args) {

		String s = "radar";
		int countOfMatches = 0;

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
				countOfMatches++;
			}
		}
		if (countOfMatches == s.length() / 2) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println(s + " isn't palindrome");
		}

	}

}
