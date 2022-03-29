package com.epam.jonline.mod04.b05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {

		System.out.println(
				"5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки \n"
						+ "различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать \n"
						+ "возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.");
		System.out.println();

		ArrayList<Tour> tours = new ArrayList<>(Arrays.asList(new Tour("name1", "RECREATION", 15, 2300, 1, 3),
				new Tour("name2", "RECREATION", 5, 1300, 2, 1), new Tour("name3", "RECREATION", 20, 3300, 3, 2),
				new Tour("name4", "CRUISE", 5, 900, 4, 3), new Tour("name5", "CRUISE", 15, 2300, 4, 2),
				new Tour("name6", "EXCURSION", 5, 1100, 5, 4), new Tour("name7", "EXCURSION", 20, 4300, 2, 1),
				new Tour("name8", "SHOPPING", 20, 2300, 1, 2), new Tour("name9", "SHOPPING", 5, 700, 2, 4),
				new Tour("name10", "SHOPPING", 15, 1500, 3, 3), new Tour("name11", "TREATMENT", 15, 1400, 1, 3),
				new Tour("name12", "TREATMENT", 5, 800, 2, 2)));

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Выберите пункт меню: \n" + 
			        "0. Выход из меню.\n" + 
					"1. Подбор путевки по кретериям.\n" + 
			        "2. Сортировка по стоимости.\n");

			if (!sc.hasNextInt()) {
				System.out.println("выбран неправильный пункт меню, повторите ввод");
				sc.next();
				continue;
			}
			int nm = sc.nextInt();
			if (nm == 0)
				break;
			if (nm < 0 || nm > 2) {
				System.out.println("выбран неправильный пункт меню, повторите ввод");
				continue;
			}

			switch (nm) {

			case 1:
				System.out.print("выберите число дней отдыха(5, 15, 20): ");
				int d = sc.nextInt();
				System.out.print("выберите вид транспорта(CAR-1, BUS-2, PLANE-3, TRAIN-4, SHIP-5): ");
				int t = sc.nextInt();
				System.out.print("выберите условия питания(BREAKFAST-1, BREAKFAST_DINNER-2, ALL_INCLUSIVE-3, NOT_FOOD-4): ");
				int f = sc.nextInt();
				for(int i = 0; i < tours.size(); i++) 
					if(d == tours.get(i).getDays() && t == tours.get(i).getTransportType() && f == tours.get(i).getFood())
						tours.get(i).print();
					break;
				
			case 2 :
				tours.sort(new Comparator <Tour>() {
					@Override
					public int compare(Tour left, Tour right) {
						if(left.getPrice() > right.getPrice()) return 1;
						else if(left.getPrice() == right.getPrice()) return 0;
						else return -1;
					}
				});
				for(int i = 0; i < tours.size(); i++) {
					tours.get(i).print();
				}
					break;
			}

		}
		sc.close();
	}

}
