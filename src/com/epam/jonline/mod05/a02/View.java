package com.epam.jonline.mod05.a02;

public class View {
    TotalCost cost = new TotalCost();

    public void showPayment(Payment payment) {
        for (Payment.Product pr : payment.getProductList()) {
            System.out.println(pr.toString());
        }
        System.out.println("Total products: " + payment.getProductList().size() + " Total summa: " + cost.paymentCost(payment) + " rub.");
    }
}
