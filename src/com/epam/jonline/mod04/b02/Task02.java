package com.epam.jonline.mod04.b02;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
        System.out.println("2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, \n" +
                "менять колесо, вывести на консоль марку автомобиля.");
        System.out.println();
        
        Scanner s = new Scanner(System.in);
        
        Car auto = Car.get(s);
        
        while (true) {
            System.out.println(
                    "Выберете пункт меню: \n" +
                            "0. выход\n" +
                            "1. ехать\n" +
                            "2. заправляться\n" +
                            "3. менять колесо\n" +
                            "4. вывести информацию об авто (марку тоже)\n" +
                            ": "
            );
            
            int ch = s.nextInt();
            if(ch == 0) 
            	break;
            if(ch < 0 || ch >4) {
            	System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            	
            switch(ch) {
            
            case 1:
            	auto.move();
            	break;
            case 2:
            	System.out.println("Введи количество топлива: ");
                double f = s.nextDouble();
            	auto.add_fuel(f);
            	break;
            case 3:
            	auto.change_wheel(s);
            	break;
            case 4:
            	System.out.println(auto.toString());
            	break;
            }
        }
	}
}
