package by.javacourse.module2.stringlikestring;

public class Task1 {
	// ƒан текст (строка). Ќайдите наибольшее количество подр€д идущих пробелов в
	// нем.
	public static void main(String[] args) {

		String s = "A       pilot  word   in      the desert awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the word, \"draw me a sheep.\" And the pilot realizes that when life's events are too difficult to understand, there is no word but to succumb to their mysteries. He pulls out pencil and paper... And thus begins this wise and enchanting fable that, in teaching the secret of what is really important in life, has changed forever the world for its readworders.";

		int countOfSpaces = 0;
		int maxCountOfSpaces = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				countOfSpaces++;
				if (countOfSpaces > maxCountOfSpaces) {
					maxCountOfSpaces = countOfSpaces;
				}
			} else {
				countOfSpaces = 0;
			}
		}
		
		System.out.println("maxCountOfSpaces = "+maxCountOfSpaces);

	}
}
