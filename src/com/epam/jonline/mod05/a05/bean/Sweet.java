package com.epam.jonline.mod05.a05.bean;

import java.io.Serializable;

public class Sweet implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private double weight;
    private double price;


    public Sweet() {
    }

    public Sweet(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
        result = result * prime + (int) weight;
        result = result * prime + (int) price;
        result = result * prime + ((name == null) ? 0 : name.hashCode());
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
        Sweet other = (Sweet) obj;
        if (weight != other.weight)
            return false;
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
        return "Name: " + name + " | Weight: " + weight + "кг | Price: " + price + "руб";
    }
}
