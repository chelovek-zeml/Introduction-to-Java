package com.epam.jonline.mod04.b01;

public class Task01 {
	public static void main(String[] args) {
		
		System.out.println("1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на \r\n"
				+ "консоль текст, заголовок текста.");
		System.out.println();
		
		Word w0 = new Word("Java.");
		Text t0 = new Text(w0);
		
		Word w1 = new Word("Java");
		Word w2 = new Word(" - ");
		Word w3 = new Word(" язык ");
		Word w4 = new Word(" программирования.");
		
		Phrase p0 = new Phrase();
		
		p0.addPhrase(w1);
		p0.addPhrase(w2);
		p0.addPhrase(w3);
		p0.addPhrase(w4);
		
		t0.addBody(p0);
		
		System.out.println("Head: " + t0.getHead());
		
		System.out.println("Body: " + t0.getBody()); 
		
	}

}
