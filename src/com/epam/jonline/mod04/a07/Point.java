package com.epam.jonline.mod04.a07;  

import java.util.Scanner;

public class Point {

	 public double x, y;

	    public Point(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    public Point() {
	        this(0, 0);
	    }

	    public static double distance(Point a, Point b) {
	        double dx = a.x - b.x;
	        double dy = a.y - b.y;
	        return Math.sqrt(dx * dx + dy * dy);
	    }

	    public void print() {
	        System.out.println("x: " + x + ",y: " + y);
	    }

	    public void read(Scanner sc) {
	        System.out.print("x: ");
	        x = sc.nextDouble();
	        System.out.print("y: ");
	        y = sc.nextDouble();
	    }
}
