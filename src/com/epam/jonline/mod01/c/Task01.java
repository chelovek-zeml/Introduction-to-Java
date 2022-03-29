package com.epam.jonline.mod01.c;

/*1. Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.*/

public class Task01 {
    public static void main(String[] args) {

        int a = 100;
        int b = 0;

        for (int i = 0; i <= a; i++) {
            b = b + i;
        }
        System.out.println(b);
    }
}