package com.epam.jonline.mod02.b;

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
        System.out.println("16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, \n" +
                "...,n2  так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между \n" +
                "собой. Построить такой квадрат. Пример магического квадрата порядка 3: ");
        System.out.println(" 6  1  8");
        System.out.println(" 7  5  3");
        System.out.println(" 2  9  4");
        System.out.println();

        System.out.print("размер магического квадрата: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[][] x = new int[n][n];

        if (n % 2 != 0) {  // Нечетный порядок
            int i = 0;
            int j = n / 2;
            for (int k = 1; k <= n * n; k++) {
                x[i][j] = k;
                if (k % n == 0) {  // Если текущее число кратно n, спускаемся вниз
                    i++;
                } else {  // Если текущее число не кратно n, идем вверх влево
                    i--;
                    j++;
                    if (i < 0)
                        i = n - 1;
                    if (j > n - 1)
                        j = 0;
                }
            }
        } else if (n % 4 != 0) {  // Одиночный и четный порядок
        	num.close();
            return;
        } else {  // Двойной четный порядок
            int c1 = 1;
            int c2 = n * n;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 4 == j % 4 || (i + j) % 4 == 3) {  // Диагональ перевернута
                        x[i][j] = c2;
                    } else {  // Недиагональный передний ряд
                        x[i][j] = c1;
                    }
                    c2--;
                    c1++;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print( x[i][j] + "\t");
            }
            System.out.println();
        }
        num.close();
    }
}
