package by.javacourse.module2.stringlikestring;

import java.util.Arrays;

public class Task10 {
	// ������ � ������� �� ���������� �����������, ������ �� ������� ���������
	// ������, ��������������� ��� �������������� ������. ���������� ����������
	// ����������� � ������ �
	public static void main(String[] args) {

		String s = "A pilot  in the 123 awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the word, \"draw me a sheep! And the pil345345345ot realizes that when life's events are too difficult to understand, 345 is no word but to succumb to their mysteries? He pulls out pencil and paper. And 234 begins this wise!";

		String[] strArray = s.split("[.?!]");

		System.out.println(Arrays.toString(strArray));

		System.out.println("count of sentences = " + strArray.length);

	}

}
