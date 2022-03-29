package com.epam.jonline.mod04.b02;

import java.util.*;

public class Wheel {
	
	public enum Type{
		WINTER, SUMMER;
	}
	
	private double diametr;
	private String brand;
	private Type type;

	public Wheel ( String brand_, double diametr_, Type type_) {
		diametr = diametr_;
		brand = brand_;
		type = type_;
	}
	
	public String toString() {
		String st = "";
		st = st + brand + " ( " + diametr + " ) ";
		if(type == Type.WINTER) 
			st = st + " WINTER ";
		 else 
			 st = st + " SUMMER ";
		return st;
	}
	
	public static Wheel get(Scanner sc) {
		Wheel w = new Wheel("", 0, Type.WINTER);
		
		System.out.print("Введите бренд: ");
        w.brand = Engine.read(sc);

        System.out.print("Введите диаметр: ");
        w.diametr = sc.nextDouble();
        
        System.out.println("Введи тип (1) - зимние, (2) - летние: ");
        while(true) {
        	int var = sc.nextInt();
        	if(var == 1) {
        		w.type = Type.WINTER;
        		break;
        	}
        	if(var == 2) {
        		w.type = Type.SUMMER;
        		break;
        	}
        }
		return w;
	}
	public double getDiametr() {
		return diametr;
	}
}
