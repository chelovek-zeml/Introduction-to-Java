package com.epam.jonline.mod01.c;

/*3. Найти сумму квадратов первых ста чисел.*/

public class Task03 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 101; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
