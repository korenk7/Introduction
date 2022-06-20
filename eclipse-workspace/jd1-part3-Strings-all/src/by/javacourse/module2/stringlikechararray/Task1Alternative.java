package by.javacourse.module2.stringlikechararray;

import java.util.Arrays;

public class Task1Alternative {
	// Дан массив названий переменных в camelCase. Преобразовать в snake_case
	public static void main(String[] args) {
		String[] array = new String[] { "camelCaseFaaFooFaa", "tempArray", "checkVariable" };
		char[] charsArray = new char[0];
		int countOfUpper = 0;
		int counterOfCycle = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) > 64 && array[i].charAt(j) < 91) {
					countOfUpper++;
				}
			}
			charsArray = new char[array[i].length() + countOfUpper];

			for (int j = 0; j < array[i].length(); j++) {
				charsArray[counterOfCycle] = array[i].charAt(j);
				counterOfCycle++;
				if (array[i].charAt(j) > 64 && array[i].charAt(j) < 91) {
					charsArray[counterOfCycle - 1] = '_';
					charsArray[counterOfCycle] = array[i].charAt(j);
					counterOfCycle++;
				}

			}
			System.out.println(Arrays.toString(charsArray));

			array[i] = new String (charsArray).toLowerCase();
			counterOfCycle = 0;
			countOfUpper = 0;
		}
		System.out.println(Arrays.toString(array));

	}

}
