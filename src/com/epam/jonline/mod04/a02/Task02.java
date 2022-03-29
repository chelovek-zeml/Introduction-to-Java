package com.epam.jonline.mod04.a02;

public class Task02 {
	public static void main(String[] args) {
		System.out.println("2.  Создйте  класс  Test2  двумя  переменными.  Добавьте  конструктор  /t"
				+ "с  входными  параметрами.  Добавьте конструктор, инициализирующий члены класса по умолчанию./t"
				+ " Добавьте set- и get- методы для полей экземпляра класса.");
		System.out.println();
		
		Test2 x = new Test2();
		x.print();
		
		x = new Test2(7,8);
		x.print();
		
		x.seta(1);
		x.setb(6);
		System.out.println("a = " + x.geta());
		System.out.println("b = " + x.getb());
	}
}
