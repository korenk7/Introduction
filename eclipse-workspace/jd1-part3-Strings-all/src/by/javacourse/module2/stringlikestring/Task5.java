package by.javacourse.module2.stringlikestring;

public class Task5 {
	// Посчитать сколько раз среди символов заданной строки встречается буква "a"
	public static void main(String[] args) {

		String s = "A pilot  in the 123 awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the word, \"draw me a sheep.\" And the pil345345345ot realizes that when life's events are too difficult to understand, 345 is no word but to succumb to their mysteries. He pulls out pencil and paper... And 234 begins this wise and enchanting fable that, in teaching the secret of what is really 234 in life, has changed forever the world for its readworders.a";

		int countOfA = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == 'a') {
				countOfA++;
			}
		}

		System.out.println("countOfA = " + countOfA);
	}

}
