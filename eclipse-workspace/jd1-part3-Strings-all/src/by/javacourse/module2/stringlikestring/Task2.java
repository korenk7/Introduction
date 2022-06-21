package by.javacourse.module2.stringlikestring;

public class Task2 {
	// в строке вставить после каждого символа a символ b;
	public static void main(String[] args) {

		String s = "A pilot  in the 123 awakes one morning to see, standing before him, the most extraordinary little fellow. \"Please,\" asks the word, \"draw me a sheep.\" And the pil345345345ot realizes that when life's events are too difficult to understand, 345 is no word but to succumb to their mysteries. He pulls out pencil and paper... And 234 begins this wise and enchanting fable that, in teaching the secret of what is really 234 in life, has changed forever the world for its readworders.a";

		StringBuilder newStr = new StringBuilder(s);
		
		System.out.println(newStr);

		for (int i = 0; i < newStr.length(); i++) {
			if (newStr.charAt(i) == 'a') {
				
				newStr.insert(i+1, 'b');
			}
		}
		
		System.out.println(newStr);
	}

}
