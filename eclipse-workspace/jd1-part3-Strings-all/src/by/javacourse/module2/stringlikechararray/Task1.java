package by.javacourse.module2.stringlikechararray;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
	// Дан массив названий переменных в camelCase. Преобразовать в snake_case
	public static void main(String[] args) {

		String[] array = new String[] { "camelCaseFaaFooFaa", "tempArray", "checkVariable" };

		Pattern p = Pattern.compile("([A-Z])");
		
		for (int i = 0; i < array.length; i++) {
			Matcher m = p.matcher(array[i]);

			StringBuffer strb = new StringBuffer();

			while (m.find()) {
				m.appendReplacement(strb, "_$0");
			}
			System.out.println(strb);
			m.appendTail(strb);
			System.out.println(strb);
			array[i] = strb.toString().toLowerCase();
			System.out.println(strb);

		}
		System.out.println(Arrays.toString(array));
	}

}
