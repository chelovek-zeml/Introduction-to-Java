package com.epam.jonline.mod01.c;

/*4. Составить программу нахождения произведения квадратов первых двухсот чисел.*/

import java.math.BigInteger;

public class Task04 {
    public static void main(String[] args) {

        double sum = 1.0;
        BigInteger bigInteger = new BigInteger("1");

        for (double i = 0.01; i < 2.01; i = i + 0.01) {
            sum = sum * Math.pow(i, 2);
        }
        System.out.println(sum);


        for (int j = 1; j < 201; j++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(j * j));
        }
        System.out.println(bigInteger);
    }
}
