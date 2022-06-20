package by.javacourse.module2.stringlikechararray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	// Заменить в строке все вхождения word на letter
	public static void main(String[] args) {

		String s = "A pilot word in the desert awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the word, \"draw me a sheep.\" And the pilot realizes that when life's events are too difficult to understand, there is no word but to succumb to their mysteries. He pulls out pencil and paper... And thus begins this wise and enchanting fable that, in teaching the secret of what is really important in life, has changed forever the world for its readworders.";

		System.out.println(s);

		Pattern pattern = Pattern.compile("word");
		Matcher m = pattern.matcher(s);
		StringBuffer strb = new StringBuffer();

		while (m.find()) {
			m.appendReplacement(strb, "letter");
		}
		m.appendTail(strb);

		System.out.println(strb);

	}
}
