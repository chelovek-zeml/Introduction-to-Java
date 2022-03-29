package com.epam.jonline.mod04.b02;

import java.util.*;

public class Engine {
	private int num;
	private int power;
	private String type_engine;
	
	public Engine(int num_, int power_, String type_engine_) {
		num = num_;
		power =power_;
		type_engine = type_engine_;
	}
	
	public String toString() {
		String st = "Тип двигателя: " + type_engine + ";\n" + "Номер двигателя: " + num + ";\n" + "Мощность двигателя: " + power + "л.с.;";
		return st;
	}
	
	public static Engine get(Scanner scan) {
		Engine eng = new Engine(0, 0, "");
		
		System.out.print("Введите номер двигателя: ");
        eng.num = scan.nextInt();

        System.out.print("Введите мощность двигателя: ");
        eng.power = scan.nextInt();

        System.out.print("Введите тип двигателя: ");
        eng.type_engine = read(scan);
        
		return eng;
	}
	
	public static String read(Scanner s) {
		String str = "";
		while(str.length() == 0)
			str = s.nextLine();
		return str;
	}

}
