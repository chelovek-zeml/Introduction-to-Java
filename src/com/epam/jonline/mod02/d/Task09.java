package com.epam.jonline.mod02.d;

public class Task09 {
	public static void main(String[] args) {
        System.out.println("9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, \n" +
                "если угол между сторонами длиной X и Y— прямой.");
        System.out.println();

        double x = 6.0;
        double y = 4.0;
        double z = 7.0;
        double t = 8.0;
        double s1 = area(x, y, z, t);
        double s2 = (x * y) / 2;
        System.out.println("Площадь четырехугольника со сторонами " + x + " , " + y + " угол между ними прямой," +
                " и сторонами " + z + " и " + t + " равен " + (s1 + s2));
    }

    public static double area(double x, double y, double z, double t) {
        double c, p, k;

        c = Math.sqrt((x * x) + (y * y));
        p = (c + z + t) / 2;
        k = Math.sqrt(p * (p - z) * (p - t) * (p - c));
        return k;
    }
}
