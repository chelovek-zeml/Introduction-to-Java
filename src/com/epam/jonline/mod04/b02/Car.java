package com.epam.jonline.mod04.b02;

import java.util.Scanner;

public class Car {
	
	private Wheel wheels[];
	private Engine engine;
	private String model;
	private double consumption;
    private double fuel_level;
    
    public Car (String model_, double consumption_, Engine engine_, Wheel wheels_[], double fuel_level_) {
    	model = model_;
        consumption = consumption_;
        engine = engine_;
        wheels = wheels_;
        fuel_level = fuel_level_;
    }
    
    public String toString() {
    	String str = "";
    	
    	 str = str + "Марка машины: " + model + "\n" + engine.toString() + "\nРасход топлива: " + consumption + "L/100 km.\n" + "Осталось топлива: " + fuel_level +
                 "л.\n" + "Колеса:   [";
         for (int i = 0; i < 4; i++) {
             str = str + wheels[i].toString() + "; ";
         }
    	return str + "]";
    }
    
    public static Car get(Scanner sc) {
    	Car car = new Car("", 0, new Engine(0, 0, ""), new Wheel[4], 0 );
    	
    	System.out.print("Введите марку автомобиля: ");
        car.model = sc.nextLine();

        System.out.print("Введите расход топлива на 100км: ");
        car.consumption = sc.nextDouble();

        System.out.print("Введите текущий уровень топлива: ");
        car.fuel_level = sc.nextDouble();

        System.out.println("Введите колеса: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("колесо №" + (i + 1));
            car.wheels[i] = Wheel.get(sc);
        }
        car.engine = Engine.get(sc);
    	
    	return car;
    }
    
    public void move() {
        if(fuel_level <= 0) {
            System.out.println("Нет топлива, машина не может двигаться");
            return;
        }
        for (int i = 1; i < 4; ++i) {
            if (wheels[i].getDiametr() != wheels[i - 1].getDiametr()) {
                System.out.println("Колеса разных диаметров, машина не может двигаться.");
                return;
            }
        }
        double distance = fuel_level / consumption;
        System.out.println("машина проехала " + distance * 100 + " км.");
        fuel_level = 0;
    }

    public void add_fuel(double value) {
        fuel_level = fuel_level + value;
    }

    public void change_wheel(Scanner sc) {
        System.out.println("Введи номер колеса [1-4]: ");
        int num;
        while (true) {
            num = sc.nextInt();
            if (num >=1 && num <= 4)
                break;
            System.out.println("Неправильный номер, повтори ввод");
        }
        wheels[num] = Wheel.get(sc);
    }
}
