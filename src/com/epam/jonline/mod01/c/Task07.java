package com.epam.jonline.mod01.c;

/*7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.*/

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число m начало промежутка: ");
        int m = sc.nextInt();
        System.out.println("Введите число n конец промежутка: ");
        int n = sc.nextInt();

        while (m <= n) {
            System.out.print("Для числа " + m);
            System.out.print(" Делители: ");
            for (int i = 2; i < n; i++) {
                if (m % i == 0 && m != i) {
                    System.out.print(i + " ");
                }
            }
            m++;
            System.out.println();
        }
        sc.close();
    }
}
