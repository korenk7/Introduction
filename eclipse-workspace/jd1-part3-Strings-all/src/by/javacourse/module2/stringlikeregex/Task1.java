package by.javacourse.module2.stringlikeregex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class Task1 {
	// Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
	// выполнять с текстом 3 различные операции:
	// отсортировать абзацы по количеству предложений; в каждом предложении
	// отсортировать слова
	// по длине;
	// отсортировать лексемы в предложении по убыванию количества вхождений
	// заданного символа
	// а в случае равенства по алфавиту

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s = "A pilot  in the 123 awakes one morning to see, standing before him. The most extraordinary little fellow.\n"
				+ "Please, asks the word, draw me a sheep! \n"
				+ "And the pil345345345ot realizes that when life's events are too difficult to understand,\n"
				+ "345 is no word but to succumb to their mysteries? He pulls out pencil and paper. And 234 begins this wise!\n";

		System.out.println(s);

		String[] paragraphs = s.split("[\\r\\n]");

	//	Pattern pattern = Pattern.compile("[\\r\\n]");
	//	Matcher matcher = pattern.matcher(s);

		System.out.println();

		menu();
		menuchoise(sc.nextInt(), paragraphs);

	}

	public static void menu() {
		System.out.println("hello, it's 1,2,3 application");
		System.out.println("1 for sort paragraphs");
		System.out.println("2 for sort words in sentenses by words length");
		System.out.println("3 for sort words in sentenses by count of chars ");
	}

	public static void menuchoise(int choise, String[] paragraphs) {

		switch (choise) {

		case (1):
			Arrays.sort(paragraphs);
			System.out.println(Arrays.toString(paragraphs));
			menu();
			menuchoise(sc.nextInt(), paragraphs);

		case (2):

			Comparator<String> stringLengthComparator = new StringLengthSort();
			for (int i = 0; i < paragraphs.length; i++) {
				String[] sentenses = paragraphs[i].split("[!?.]");
				String[] words = new String[0];

				words = new String[paragraphs[i].length()];

				for (int j = 0; j < sentenses.length; j++) {
					words = sentenses[j].split(" ");
					Arrays.sort(words, stringLengthComparator);
					System.out.println(Arrays.toString(words));
				}
			}

			menu();
			menuchoise(sc.nextInt(), paragraphs);

		case (3):
			
			System.out.println("need some char for search");
			String input = sc.next();
			
			
			

		}

	}

}

class StringLengthSort implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		if (o1.length() > o2.length()) {
			return 1;
		} else {
			if (o1.length() < o2.length()) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
