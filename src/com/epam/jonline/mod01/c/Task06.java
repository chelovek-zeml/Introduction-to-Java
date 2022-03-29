package com.epam.jonline.mod01.c;

/*6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.*/

public class Task06 {
    public static void main(String[] args) {

        for (char i = 32; i < 127; i++) {
            System.out.println(i + " " + (i + 0));
        }
    }
}