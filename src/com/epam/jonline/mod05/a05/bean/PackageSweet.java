package com.epam.jonline.mod05.a05.bean;

import java.io.Serializable;

public class PackageSweet implements Serializable {

    private static final long serialVersionUID = 4L;

    private String name;
    private double price;
    private double size;

    public PackageSweet() {
    }

    public PackageSweet(String name, double size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (int) size;
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
        PackageSweet other = (PackageSweet) obj;
        if (size != other.size)
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
        return "Name: " + name + " | Size: " + size + "кг | Price: " + price + "руб";
    }
}
