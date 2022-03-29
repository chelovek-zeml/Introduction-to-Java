package com.epam.jonline.mod04.a09;

public class Books {

	private int size;
	private int capasity;
	private Book[] books;

	public Books(int capasity_) {
		capasity = capasity_;
		size = 0;
		books = new Book[capasity];
	}

	public Books() {
		this(10);
	}

	public void dubCapasity(Book book) {
		if (size < capasity) {
			books[size] = book;
			size++;
		} else {
			Book[] buf = new Book[capasity * 2];
			for (int i = 0; i < size; i++) {
				buf[i] = books[i];
			}
			books = buf;
			capasity = capasity * 2;
			books[size] = book;
			size++;
		}
	}

	public void print_author(String a) {
		for (int i = 0; i < size; i++) {
			if (books[i].getAuthor().compareTo(a) == 0) {
				books[i].print();
			} else {
				System.out.println("Книги автора " + a + " отсутсвуют");
			}
		}
	}

	public void print_publishing_house(String a) {
		for(int i = 0; i < size; i++)
			if (books[i].getPublishing_house().compareTo(a) == 0) {
				books[i].print();
			}else {
				System.out.println("Книги " + a + " издательства отсутсвуют");
			}
	}

	public void print_year_of(String a) {
		for(int i = 0; i < size; i++) 
			if(books[i].getYear_of().compareTo(a) == 0) {
				books[i].print();
			}else {
				System.out.println("Книги выпущенные после " + a + " отсутсвуют");
			}
	}
	
	
}
