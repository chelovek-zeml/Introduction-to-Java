package com.epam.jonline.mod04.a06;

public class Task06 {
	public static void main(String[] args) {
		System.out.println(
				"6.  Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и \r\n"
						+ "изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае \r\n"
						+ "недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на \r\n"
						+ "заданное количество часов, минут и секунд.");
		System.out.println();

		Time t = new Time(12, 34, 45);

		t.print();
		System.out.println("-------------");

		t.addS(45);
		t.print();
		System.out.println("-------------");

		t.addM(40);
		t.print();
		System.out.println("-------------");

		t.addH(4);
		t.print();
		System.out.println("-------------");

		t.addS(40);
		t.addM(50);
		t.addH(5);
		t.print();
		System.out.println("-------------");
	}

}
