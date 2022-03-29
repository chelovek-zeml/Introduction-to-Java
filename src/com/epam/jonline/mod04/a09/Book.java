package com.epam.jonline.mod04.a09;

import java.util.Scanner;

public class Book {
	
	private int id;
	private static int ID;
	private String name, author, publishing_house, number_page, year_of, price, type_binding;
	
	public Book(String name_, String author_, String publishing_house_, String number_page_, String year_of_, String price_, String type_binding_) {
		name = name_;
		author = author_;
		publishing_house = publishing_house_;
		number_page = number_page_;
		year_of = year_of_;
		price = price_;
		type_binding = type_binding_;
		id = ID++;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublishing_house() {
		return publishing_house;
	}
	public String getNumber_page() {
		return number_page;
	}
	public String getYear_of() {
		return year_of;
	}
	public String getPrice() {
		return price;
	}
	public String getType_binding() {
		return type_binding;
	}
	
	public void setName(String name_) {
		name = name_;
	}
	public void setAuthor(String author_) {
		author = author_;
	}
	public void setPublishing_house(String publishing_house_) {
		publishing_house = publishing_house_;
	}
	public void setNumber_page(String number_page_) {
		number_page = number_page_;
	}
	public void setYear_of(String year_of_) {
		year_of = year_of_;
	}
	public void setPrice(String price_) {
		price = price_;
	}
	public void setType_binding(String type_binding_) {
		type_binding = type_binding_;
	}
	
	public String toString() {
		return id + "." + "Название книги:  " + name + ".\n" + "Автор:  " + author + ".\n" + "Издательство:  " + publishing_house + ".\n"
                + "Год выпуска:  " + year_of + ".\n" + "Количество страниц:  " + number_page + ".\n" + "Цена:  " + price + ".\n" +
                "Тип переплета:  " + type_binding;
	}
	
	public void print() {
		System.out.println(toString());
	}
	
	public static String readString(Scanner sc) {
		String st = "";
		while(st.length() == 0) {
			st = sc.nextLine();
		}
		return st;
	}
	
	public static Book getBook(Scanner scan) {
		Book book = new Book("", "", "", "", "", "", "");
		System.out.print("Название книги: ");
		book.name = readString(scan);
		System.out.print("Автор: ");
		book.author = readString(scan);
		System.out.print("Издательство: ");
		book.publishing_house = readString(scan);
		System.out.println("Год выпуска: ");
        book.year_of = readString(scan);
        System.out.println("Количество страниц:: ");
        book.number_page = readString(scan);
        System.out.println("Цена: ");
        book.price = readString(scan);
        System.out.println("Тип переплета: ");
        book.type_binding = readString(scan);
		
		return book;
	}
 
}
