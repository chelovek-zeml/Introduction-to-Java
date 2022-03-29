package com.epam.jonline.mod04.a05;

public class Task05 {
	public static void main(String[] args) {
		System.out.println("5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение \r\n"
				+ "на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и \r\n"
				+ "произвольными  значениями. Счетчик  имеет  методы  увеличения  и  уменьшения  состояния,  и  метод \r\n"
				+ "позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.");
		System.out.println();
		
		Counter a = new Counter(0, 99);                    //Начальные значения двух счетчиков.
		Counter b = new Counter(0, 99, 45);
		
		System.out.println("a= " + a.getCondition());
		System.out.println("b= " + b.getCondition());
		System.out.println();
		
		for(int i = 0; i < 4; i++) {                       //Увеличение счетчика.
			a.inc();
			b.inc();
		}
		System.out.println("a= " + a.getCondition());
		System.out.println("b= " + b.getCondition());
		System.out.println();
		
		for(int i = 0; i < 10; i++) {                      //Уменьшение счетчика.
			a.dec();
			b.dec();
		}
		System.out.println("a= " + a.getCondition());
		System.out.println("b= " + b.getCondition());
		System.out.println();
	}

}
