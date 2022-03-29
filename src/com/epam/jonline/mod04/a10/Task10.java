package com.epam.jonline.mod04.a10;

import java.util.Scanner;


public class Task10 {
	public static void main(String[] args) {
		System.out.println("10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы \r\n"
				+ "и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и \r\n"
				+ "методами. Задать критерии выбора данных и вывести эти данные на консоль.  \r\n"
				+ " \r\n"
				+ "Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.  \r\n"
				+ "Найти и вывести:  \r\n"
				+ "a) список рейсов для заданного пункта назначения;  \r\n"
				+ "b) список рейсов для заданного дня недели;  \r\n"
				+ "c) список рейсов для заданного дня недели, время вылета для которых больше заданного");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		Airlines airlines = new Airlines(1);
		
		while (true) {
            System.out.println();
            System.out.print(
                    "Выберете пункт меню:\n"
                            + "0. Выйти.\n"
                            + "1. Добавить рейс.\n"
                            + "2. Список рейсов для заданного пункта назначения.\n"
                            + "3. Список рейсов для заданного дня недели.\n"
                            + "4. Список рейсов для заданного дня недели, время вылета для которых больше заданного.\n"
                            + ": "
            );
            
            if(!sc.hasNextInt()) {
            	System.out.println("выбран неправильный пункт меню, повторите ввод.");
            	sc.next();
            	continue;
            }
            
            int ch = sc.nextInt();
            if (ch == 0)
                break;
            if(ch < 0 || ch > 4) {
            	 System.out.println("выбран неправильный пункт меню, повторите ввод.");
                 continue;
             }
            
            switch(ch) {
            	
            case 1:
            	airlines.double_capasity(Airline.getAirline(sc));
            	break;
            case 2:
            	System.out.println("Введите пункт назначения: ");
            	String n_destination = Airline.read(sc);
            	airlines.print_destination(n_destination);
            	break;
            case 3:
            	 System.out.println("Введите день недели(пн, вт, ср, чт, пт, сб, вс): ");
            	 String n_day = Airline.read(sc);
            	 airlines.print_day(n_day);
            	break;
            case 4:
            	System.out.println("Введите день недели(пн, вт, ср, чт, пт, сб, вс): ");
            	 n_day = Airline.read(sc);
            	airlines.print_day_time(n_day);
            	break;
            }
		}   
	}

}












