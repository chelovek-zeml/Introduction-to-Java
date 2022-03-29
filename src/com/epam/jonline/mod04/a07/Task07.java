package com.epam.jonline.mod04.a07;

import java.util.Scanner;

public class Task07 {
	 public static void main(String[] args) {
		 System.out.println("7.  Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления \r\n"
		 		+ "площади, периметра и точки пересечения медиан");
		 System.out.println();
		 
	        Scanner sc = new Scanner(System.in);

	        Point a = new Point();
	        Point b = new Point();
	        Point c = new Point();

	        System.out.println("enter A: ");
	        a.read(sc);

	        System.out.println("enter B: ");
	        b.read(sc);

	        System.out.println("enter C: ");
	        c.read(sc);

	        Triangle triangle = new Triangle(a, b, c);

	        System.out.println("square: " + triangle.square());
	        System.out.println("perimetr: " + triangle.perimetr());
	        System.out.print("medianCrosing: ");
	        triangle.medianCrossing().print();
	    }
}
