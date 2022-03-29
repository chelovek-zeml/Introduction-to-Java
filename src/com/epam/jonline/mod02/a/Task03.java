package com.epam.jonline.mod02.a;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
        System.out.println("3.Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,\n" +
                "положительных и нулевых элементов.");
        System.out.println();
        Scanner num = new Scanner(System.in); 
        System.out.print("Введите длину массива: ");
        int N = num.nextInt();
        int[] A = new int[N];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < N; i++) {
            A[i] = num.nextInt();
        }
	
        
        int x = 0;
        int y = 0;
        int z = 0;
        System.out.println();
        System.out.println("Введенные элементы массива :");
        for (int i = 0; i < N; i++) {
            System.out.print(" " + A[i]);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                x = x + 1;
            } else if (A[i] > 0) {
                y = y + 1;
            } else z = z + 1;
        }
        System.out.println("В даном массиве действительных отрицательных чисел: " + x + "\n" +
                "                действительных положительных чисел: " + y + "\n" +
                "                                 нулевых элементов: " + z);
        num.close();
    }
}
