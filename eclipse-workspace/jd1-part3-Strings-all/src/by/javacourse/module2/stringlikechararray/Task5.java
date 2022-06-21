package by.javacourse.module2.stringlikechararray;

public class Task5 {
	// Удалить в строке все лишние пробелы, т.е серии подряд идущих пробелов
	// заменить на одиночные пробелы. Крайние пробелы в строке удалить.
	public static void main(String[] args) {

		String s = "  A pilot  in the 123   awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the word, \"draw me a sheep.\" And the pil345345345ot realizes that when life's events are too difficult to understand, 345 is no word but to succumb to their mysteries. He pulls out pencil and paper... And 234 begins this wise and enchanting fable that, in teaching the secret of what is really 234 in life, has changed forever the world for its readworders.";
		System.out.println(s);
		s = s.trim();
		System.out.println(s);
		String newS = new String();

		char[] array = s.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ' && array[i - 1] == ' ') {
				
			} else {
				newS += array[i];
			}

		}
		System.out.println(newS);

	}

}
