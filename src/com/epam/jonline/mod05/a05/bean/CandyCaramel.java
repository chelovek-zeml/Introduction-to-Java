package com.epam.jonline.mod05.a05.bean;

import java.io.Serializable;

public class CandyCaramel extends Sweet implements Serializable {

    private static final long serialVersionUID = 3L;

    public CandyCaramel(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "Caramel candy " + super.toString();
    }

}
