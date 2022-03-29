package com.epam.jonline.mod02.d;

public class Task04 {
	public static void main(String[] args) {
        System.out.println("4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими \n" +
                "из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.");
        System.out.println();

        int[] x = {3, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] y = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int r = 0;
        int k, ximax, yimax, xjmax, yjmax;
        ximax = 0;
        yimax = 0;
        xjmax = 0;
        yjmax = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < y.length; j++) {
                k = (int) Math.sqrt(((x[j] - x[i]) * (x[j] - x[i])) + ((y[j] - y[i]) * (y[j] - y[i])));
                if (k > r) {
                    r = k;
                    ximax = x[i];
                    yimax = y[i];
                    xjmax = x[j];
                    yjmax = y[j];
                }
            }
        }
        System.out.print("самое большое расстояние между точками с координатами : " + ximax + ";" + yimax + " и " + xjmax + ";" + yjmax);
    }
}
