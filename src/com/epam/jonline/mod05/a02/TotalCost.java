package com.epam.jonline.mod05.a02;

public class TotalCost {

    public double paymentCost(Payment payment) {
        double temp = 0;
        for (Payment.Product product : payment.getProductList()) {
            temp = temp + product.getPrice();
        }
        return temp;
    }
}
