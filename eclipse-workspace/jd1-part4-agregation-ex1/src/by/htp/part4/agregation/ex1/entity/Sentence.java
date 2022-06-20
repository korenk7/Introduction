package by.htp.part4.agregation.ex1.entity;



public class Sentence {
private String sentence = "";
	
	public Sentence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sentence(String sentence) {
		super();
		this.sentence = sentence;
	}


	public String getSentence() {
		return sentence;
	}


	public void addWord(Word word) {
		sentence = sentence + word.getWord() + " ";
	}
}
