package com.epam.jonline.mod01.b;

/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/

public class Task01 {
    public static void main(String[] args) {

        double a = 30;
        double b = 60;
        if ((a + b) < 180) {
            System.out.println("треугольник существует");
            if ((180 - a - b) == 90) {
                System.out.println("треугольник прямоугольный");
            }
        } else
            System.out.println("треугольник не существует");
    }
}
