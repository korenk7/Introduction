package by.htp.part4.agregation.ex1.main;

import by.htp.part4.agregation.ex1.entity.Sentence;
import by.htp.part4.agregation.ex1.entity.Text;
import by.htp.part4.agregation.ex1.entity.Word;

public class Main {

	public static void main(String[] args) {
		
		
		Text text = new Text();

		Word word1 = new Word("First");
		Word word2 = new Word("agregation");
		Word word3 = new Word("task");
		Sentence sent1 = new Sentence();

		sent1.addWord(word1);
		sent1.addWord(word2);
		sent1.addWord(word3);

		Word word4 = new Word("I");
		Word word5 = new Word("created");
		Word word6 = new Word("text");
		Sentence sent2 = new Sentence();
		
		Sentence sent3 = new Sentence("sentence3");
		

		sent2.addWord(word4);
		sent2.addWord(word5);
		sent2.addWord(word6);

		text.addHeader(sent1);
		text.addText(sent2,sent3);

		text.printHeader();
		text.printText();

	}

}
