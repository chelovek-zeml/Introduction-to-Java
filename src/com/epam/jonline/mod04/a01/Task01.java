package com.epam.jonline.mod04.a01;

public class Task01 {

	public static void main(String[] args) {
		
		System.out.println("1.  Создайте  класс  Test1  двумя  переменными.  Добавьте  метод  вывода  на  экран  и  методы  изменения  этих \r\n" + 
				"переменных. Добавьте метод, который находит сумму  значений этих  переменных, и  метод, который находит \r\n" + 
				"наибольшее значение из этих двух переменных.");
		System.out.println();
		
		Test1 x = new Test1();
		
		x.print();
	
		x.a = 8;
		x.b = 9;
		x.print();
		
	}
}
