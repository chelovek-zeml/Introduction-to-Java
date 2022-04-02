package com.epam.jonline.mod05.a02;

public class Task02 {
    /*Задача 2.
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.*/
    public static void main(String[] args) {

        Payment p = new Payment();
        View v = new View();

        p.addProduct(new Payment.Product("milk", 1.80));
        p.addProduct(new Payment.Product("bread", 1.50));
        p.addProduct(new Payment.Product("butter", 5.80));
        p.addProduct(new Payment.Product("wine", 31.40));
        p.addProduct(new Payment.Product("eggs", 3.30));

        v.showPayment(p);

    }
}
