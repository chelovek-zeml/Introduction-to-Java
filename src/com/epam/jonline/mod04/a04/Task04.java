package com.epam.jonline.mod04.a04;

import java.util.Scanner;
import java.util.*;

public class Task04 {
	public static void main(String[] args) {

		System.out.println("4.  Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. \r\n"
				+ "Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по \r\n"
				+ "номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. \r\n"
				+ "Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами \r\n"
				+ "назначения должны быть упорядочены по времени отправления.");

		Scanner sc = new Scanner(System.in);
		int n = 5;
		Train trains[] = new Train[n];

		trains[0] = new Train("Москва", 701, "11:00");
		trains[1] = new Train("Москва", 711, "12:00");
		trains[2] = new Train("Киев", 801, "11:30");
		trains[3] = new Train("Киев", 821, "19:00");
		trains[4] = new Train("Москва", 721, "19:00");

		while (true) {
			System.out.println();
			System.out.println("Выберите пункт меню: ");
			System.out.println();
			System.out.println(
					"1. Все поезда." + "\n" + "2. Сортировка по пункту назначения. " + "\n" + "3. Сортровка по номеру. "
							+ "\n" + "4. Выбрать поезд по позиции в перечне. " + "\n" + "5. Выход из меню. " + "\n");

			int punkt;
			punkt = sc.nextInt();
			if (punkt == 5)
				break;
			if (punkt < 1 || punkt > 5) {
				System.out.println("Такой пункт в меню отсутствует. Попробуйте еще раз.");
				continue;
			}
			
			switch (punkt) {

			case 1:
				System.out.println("Все поезда:");
				System.out.println();
				for (int i = 0; i < trains.length; i++) {
					System.out.print((i + 1) + ".  ");
					trains[i].print();
				}

				break;
			case 2:
				Arrays.sort(trains, new Train.StationTimeComparator());
				for (int i = 0; i < trains.length; i++) {
					System.out.print((i + 1) + ".  ");
					trains[i].print();
				}
				break;
			case 3:
				Arrays.sort(trains, new Train.NumberComparator());
				for (int i = 0; i < trains.length; i++) {
					System.out.print((i + 1) + ".  ");
					trains[i].print();
				}
				break;
			case 4:
				int pos;
				System.out.println("Введите номер позиции поезда: ");
				pos = sc.nextInt();
				if (pos < 1 || pos > 5) {
					System.out.println("Такая позиция отсутствует. Попробуйте еще раз.");
					continue;
				}
				System.out.print(pos + ".  ");
				trains[pos - 1].print();
				break;
			}
		}
		sc.close();
	}
}
