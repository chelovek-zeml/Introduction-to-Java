package com.epam.jonline.mod04.a08;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		System.out.println(
				"8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы \r\n"
						+ "и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами \r\n"
						+ "и методами. Задать критерии выбора данных и вывести эти данные на консоль.  \r\n" + " \r\n"
						+ "Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  \r\n"
						+ "Найти и вывести:  \r\n" + "a) список покупателей в алфавитном порядке;  \r\n"
						+ "b) список покупателей, у которых номер кредитной карточки находится в заданном интервале");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		Customers customers = new Customers(1);

		while (true) {
			System.out.println();
			System.out.print("Выберете пункт меню:\n" 
					+ "0. выйти\n" 
					+ "1. добавить покупателя\n"
					+ "2. вывод покупателей в алфавитном порядке\n"
					+ "3. вывод покупателей с кредитной картой в интервале\n" + ": ");

			if (!sc.hasNextInt()) {
				System.out.println("выбран неправильный пункт меню, повторите ввод.");
				sc.next();
				continue;
			}

			int ch = sc.nextInt();
			if (ch == 0)
				break;
			if (ch < 0 || ch > 3) {
				System.out.println("выбран неправильный пункт меню, повторите ввод.");
				continue;
			}
			
			switch(ch) {
				case 1:
					customers.pushBack(Customer.getCustomer(sc));
					break;
				case 2:
					customers.sortByName();
					customers.printer();
					break;
				case 3:
					System.out.println("Введи диапазон кредитных карт\n");
					System.out.println("От: ");
					String from = Customer.readLine(sc);
					System.out.println("До: ");
					String to = Customer.readLine(sc);
					customers.printCard(from, to);
			}
		}
	}

}
