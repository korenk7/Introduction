package by.javacourse.module2.stringlikechararray;

import java.util.Arrays;

public class Task3 {
	// в строке найти количество цифр
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A pilot  in the 123 awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the word, \"draw me a sheep.\" And the pil345345345ot realizes that when life's events are too difficult to understand, 345 is no word but to succumb to their mysteries. He pulls out pencil and paper... And 234 begins this wise and enchanting fable that, in teaching the secret of what is really 234 in life, has changed forever the world for its readworders.";

		char[] array = new char[s.length()];
		int countOfNums = 0;


		for (int i = 0; i < array.length; i++) {
			array[i] = s.charAt(i);
			if (array[i] > 48 && array[i] < 57) {
				countOfNums++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("count of digits = " + countOfNums);
	}

}
