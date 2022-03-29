package com.epam.jonline.mod02.a;

public class Task07 {
	public static void main(String[] args) {
        System.out.println("9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.\n" +
                " Если таких чисел несколько, то определить наименьшее из них.");
        System.out.println();
        int x = 0;
        int[] A = {2, 6, 7, 5, 3, 5, 7, 5, 3, 2, 8, 5, 6, 2, 2,};
        for (int k = 0; k < A.length; k++) {
            if (x < A[k]) {
                x = A[k];
            }
        }
        int c = 0;
        int[] B = new int[A.length];
        for (int j = 0; j < A.length; j++) {
            B[A[j]]++;
            if (c < B[A[j]] && x > A[j]) {
                c = B[A[j]];
                x = A[j];
            }
        }
        System.out.println(x);
	}
}
