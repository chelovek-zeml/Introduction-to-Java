package com.epam.jonline.mod01.b;

/*5. Вычислить значение функции
*
*           | x^2 - 3 * x + 9, если x<=3;
*    F(x) = |
*           | 1 / (x^3 + 6), если x>3;
* */

public class Task05 {
    public static void main(String[] args) {

        double F;
        double x = 0;

        if (x <= 3) {
            F = x * x - 3 * x + 9;
        } else {
            F = 1 / (x * x * x + 6);
        }
        System.out.println(F);
    }
}