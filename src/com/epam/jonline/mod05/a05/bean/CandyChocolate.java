package com.epam.jonline.mod05.a05.bean;

import java.io.Serializable;

public class CandyChocolate extends Sweet implements Serializable {

    private static final long serialVersionUID = 2L;


    public CandyChocolate(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return "Chocolate candy " + super.toString();
    }
}
