package com.epam.jonline.mod02.b;

public class Task11 {
	public static void main(String[] args) {
        System.out.println("11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в \n" +
                "которых число 5 встречается три и более раз. ");
        System.out.println();

        int a = 0;
        int[][] x = new int[10][20];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int) (Math.random() * 16);
                System.out.printf("%3d",x[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int k = 0; k < x.length; k++) {
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[i].length; j++) {
                    if (i == k && x[i][j] == 5) {
                        a++;
                    }
                }
            }
            if (a >= 3) {
                System.out.print("В строке " + (k + 1) + " 5 встречается три и более раз.");
                System.out.println();
            }
            a = 0;
        }
    }
}
