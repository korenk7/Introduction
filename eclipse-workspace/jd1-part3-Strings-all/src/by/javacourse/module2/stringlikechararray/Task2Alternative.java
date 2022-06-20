package by.javacourse.module2.stringlikechararray;

import java.util.Arrays;

public class Task2Alternative {

	public static void main(String[] args) {

		String s = "A pilot word in the desert awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the word, \"draw me a sheep.\" And the pilot realizes that when life's events are too difficult to understand, there is no word but to succumb to their mysteries. He pulls out pencil and paper... And thus begins this wise and enchanting fable that, in teaching the secret of what is really important in life, has changed forever the world for its readworders.";

		char[] charsArray = s.toCharArray();

		String newString = new String();

		System.out.println(Arrays.toString(charsArray));

		for (int i = 0; i < charsArray.length; i++) {
			if (charsArray[i] == 'w' && charsArray[i + 1] == 'o' && charsArray[i + 2] == 'r'
					&& charsArray[i + 3] == 'd') {

				newString += "letter";
				i = i + 3;
			} else {
				newString += charsArray[i];
			}

		}

		System.out.println(s);
		System.out.println(newString);

	}

}
