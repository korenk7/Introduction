package by.javacourse.module2.stringlikechararray;

import java.util.Arrays;

public class Task4 {
	// в строке найти количество чисел
	public static void main(String[] args) {

		String s = "A pilot  in the 123 awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the word, \"draw me a sheep.\" And the pil345345345ot realizes that when life's events are too difficult to understand, 345 is no word but to succumb to their mysteries. He pulls out pencil and paper... And 234 begins this wise and enchanting fable that, in teaching the secret of what is really 234 in life, has changed forever the world for its readworders.";

		char[] array = new char[s.length()];
		int countOfDigits = 0;
		int countOfNums = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = s.charAt(i);
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 48 && array[i] < 57) {
				if(array[i+1] > 48 && array[i+1] < 57) {
					countOfDigits++;
				} else {
					countOfDigits++;
					countOfNums++;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("count of digits = " + countOfDigits);
		System.out.println("count of nums = " + countOfNums);

	}

}
