package com.epam.jonline.mod04.a09;

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		System.out.println(
				"9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и \r\n"
						+ "метод    toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и \r\n"
						+ "методами. Задать критерии выбора данных и вывести эти данные на консоль.  \r\n" + " \r\n"
						+ "Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  \r\n"
						+ "Найти и вывести:  \r\n" + "a) список книг заданного автора;  \r\n"
						+ "b) список книг, выпущенных заданным издательством;  \r\n"
						+ "c) список книг, выпущенных после заданного года.");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		Books books = new Books(1);

		while (true) {
			System.out.println();
			System.out.print("Выберете пункт меню:\n" + "0. Выйти.\n" + "1. Добавить книгу.\n"
					+ "2. Список книг заданного автора.\n" + "3. Список книг, выпущенных заданным издательством.\n"
					+ "4. Список книг, выпущенных после заданного года.\n" + ": ");
			if (!sc.hasNextInt()) {
				System.out.println("выбран неправильный пункт меню, повторите ввод.");
				sc.next();
				continue;
			}
			int choice = sc.nextInt();
			if (choice == 0)
				break;
			if (choice < 1 || choice > 4) {
				System.out.println("выбран неправильный пункт меню, повторите ввод.");
				continue;
			}

			switch (choice) {
			case 1:
				books.dubCapasity(Book.getBook(sc));
				break;
			case 2:
				System.out.println("Введите имя автора: ");
				String name_author = Book.readString(sc);
				books.print_author(name_author);
				break;
			case 3:
				System.out.println("Введите издательство: ");
				String name_publishing_house = Book.readString(sc);
				books.print_publishing_house(name_publishing_house);
				break;
			case 4:
				System.out.println("Введите год: ");
				String name_year = Book.readString(sc);
				books.print_year_of(name_year);
				break;
			}
		}
	}

}
