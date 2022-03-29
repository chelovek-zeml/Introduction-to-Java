package com.epam.jonline.mod04.b01;

public class Phrase {
	
	private String phrase = "";
	
	public void addPhrase(Word word) {
		phrase = phrase + word.getWord();
	}
	 
	public String getPhrase() {
		return phrase;
	}

}
