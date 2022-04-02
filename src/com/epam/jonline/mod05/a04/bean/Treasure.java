package com.epam.jonline.mod05.a04.bean;

import java.io.Serializable;

public class Treasure implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private double price;

    public Treasure(){}

    public Treasure(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName () {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (int) price;
        result = result * 31 + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Treasure other = (Treasure) obj;
        if (price != other.price)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | " + "Price: " + price + "\n";
    }
}
