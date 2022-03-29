package com.epam.jonline.mod04.a10;

import java.util.Scanner;

public class Airlines {

	private Airline[] airlines;
	private int capasity;
	private int size;

	public Airlines(int capasity_) {
		capasity = capasity_;
		size = 0;
		airlines = new Airline[capasity];
	}

	public Airlines() {
		this(10);
	}

	public void double_capasity(Airline airline) {

		if (size < capasity) {
			airlines[size] = airline;
			size++;
		} else {
			Airline[] buffer = new Airline[capasity * 2];
			for (int i = 0; i < size; i++) {
				buffer[i] = airlines[i];
			}
			airlines = buffer;
			capasity = capasity * 2;
			airlines[size] = airline;
			size++;
		}
	}

	public void print_destination(String a) {
		for (int i = 0; i < size; i++) {
			if (airlines[i].getDestination().compareTo(a) == 0) {
				airlines[i].print();
			} else
				System.out.println("Пункт назначения " + a + " отсутсвует");
		}
	}

	public void print_day(String a) {
		for (int i = 0; i < size; i++) {
			if (airlines[i].getDay().compareTo(a) == 0) {
				airlines[i].print();
			} else
				System.out.println("Рейсы в " + a + " отсутсвует");
		}
	}

	public void print_day_time(String a) {
		for (int i = 0; i < size; i++) {
			if (airlines[i].getDay().compareTo(a) == 0) {
				System.out.println("Введите время : ");
				Scanner scanner = new Scanner(System.in);
				String str = Airline.read(scanner);
				if (airlines[i].getTime().compareTo(str) > 0) {
					airlines[i].print();
				} else
					System.out.println("Рейсы в " + a + " после " + str + " отсутсвует");
			} else
				System.out.println("Рейсы в " + a + " отсутсвует");
		}
	}

}
