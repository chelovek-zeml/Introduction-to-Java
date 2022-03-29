package com.epam.jonline.mod01.c;

/*8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/


public class Task08 {
    public static void main(String[] args) {

        int a = 1245682911;
        int b = 963521235;


        for (int i = 0; i < 10; i++) {
            int temp1 = a;
            int temp2 = b;
            int cont = 1;                    // счетчик, чтобы дублирующие цифры не поподали в поле зрения.
            while (temp1 > 0) {
                int m = temp1 % 10;
                if (i == m) {
                    while (temp2 > 0) {
                        int n = temp2 % 10;
                        if (i == n && cont == 1) {
                            System.out.println(i + " ");
                            cont++;
                        }
                        temp2 = temp2 / 10;
                    }
                }
                temp1 = temp1 / 10;
            }
        }
    }
}