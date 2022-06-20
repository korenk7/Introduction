package by.javacourse.module2.stringlikestring;

public class Task4 {
	// с помощью функций копирования и конкантетации составить из слова
	// "информатика" слово "торт"
	public static void main(String[] args) {

		String s = "информатика";
		StringBuilder newStr = new StringBuilder();
		
		newStr.append(s.charAt(7)).append(s.substring(3, 5)).append(s.charAt(7));
		
		System.out.println(newStr);
	}

}
