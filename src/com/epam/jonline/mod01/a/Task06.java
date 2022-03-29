package com.epam.jonline.mod01.a;

/*
 * 6. Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в
 * противном случае.
 */

public class Task06 {
	public static void main(String[] args) {

		int x = 5;
		int y = 0;
		if ((x >= -4 && y >= -3) && (x >= -2 && y <= 4) && (x <= 4 && y >= -3) && (x <= 2 && y <= 4)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
