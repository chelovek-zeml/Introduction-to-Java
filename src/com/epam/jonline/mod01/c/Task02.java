package com.epam.jonline.mod01.c;

/*2. Вычислить значения функции на отрезке [а,b] c шагом h:
*
*     | x, x > 2
* y = |
*     | -x, x <=2
* */

public class Task02 {
    public static void main(String[] args) {

        int a = 1;
        int b = 10;
        int h = 2;

        for (int x = a; x <= b; x = x + h) {
            if (x > 2) {
                System.out.println("y= " + x);
            }else {
                System.out.println("y= " + -x);
            }
        }
    }
}
