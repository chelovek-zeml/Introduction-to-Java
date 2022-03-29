package com.epam.jonline.mod04.b01;

public class Text {
	
	private String head;
	private String body = "";
	
	public Text(Word word) {
		head = word.getWord();
	}
	
	public Text(Phrase phrase) {
		head = phrase.getPhrase();
	}
	
	public void addBody(Word word) {
		body = body + word.getWord();
	}
	
	public void addBody(Phrase phrase) {
		body = body + phrase.getPhrase();
	}
	
	public String getBody() {
		return body;
	}

	public String getHead() {
		return head;
	}
}
