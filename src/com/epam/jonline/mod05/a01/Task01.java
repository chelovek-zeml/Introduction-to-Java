package com.epam.jonline.mod05.a01;

public class Task01 {

	/*
	 * Задача 1. Создать объект класса Текстовый файл, используя классы Файл,
	 * Директория. Методы: создать, переименовать, вывести на консоль содержимое,
	 * дополнить, удалить.
	 */
	public static void main(String[] args) {

		FileText txt = new FileText("test01.txt", "Hello");
		Directory dir = new Directory("Test");
		dir.addFile(txt);
		View.printDirectory(dir);
		dir.addDirectory(new Directory("Test-1"));
		dir.addFile(new File("test02"));
		txt.addText(" Java");
		View.printDirectory(dir);
		dir.removeFile("test02");
		dir.setName("Task");
		View.printDirectory(dir);
	}

}
