package com.epam.jonline.mod02.d;

public class Task03 {
	public static void main(String[] args) {
        System.out.println("3.  Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  используя  метод  вычисления  площади \n" +
                "треугольника");
        System.out.println();

        double a = 6.0;
        double s = area(a);
        System.out.println("площадь  правильного  шестиугольника  со  стороной: " + a + " равна : " + (6 * s));
    }

    public static double area(double a) {
        double S = (a * a * Math.sqrt(3)) / 4;
        return S;
    }
}
