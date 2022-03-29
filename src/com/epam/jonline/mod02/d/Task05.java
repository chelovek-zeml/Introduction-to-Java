package com.epam.jonline.mod02.d;

public class Task05 {
	public static void main(String[] args) {
        System.out.println("5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, \n" +
                "которое меньше максимального элемента массива, но больше всех других элементов).");
        System.out.println();

        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int y = 0;
        int z = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > y) {
                y = x[i];
            }
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i]>z && x[i] < y) {
                z = x[i];
            }
        }
        System.out.println(z);
    }

}
