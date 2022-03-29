package com.epam.jonline.mod01.b;

/*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.*/

public class Task04 {
    public static void main(String[] args) {

        int A = 10;
        int B = 20;
        int x = 8;
        int y = 6;
        int z = 150;

        if (((x < A || x < B) && (y < A || y < B)) || ((x < A || x < B) && (z < A || z < B)) || ((y < A || y < B) && (z < A || z < B))) {
            System.out.println("пройдет кирпич через отверстие.");
        } else System.out.println("не пройдет кирпич через отверстие.");
    }
}
