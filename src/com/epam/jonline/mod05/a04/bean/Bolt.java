package com.epam.jonline.mod05.a04.bean;

import java.io.Serializable;

public class Bolt extends Treasure implements Serializable {
    private static final long serialVersionUID = 5L;
    private String material;
    private String stones;

    public Bolt() {
    }

    public Bolt(String material, String name, String stones, double price) {
        super(name, price + 2);
        this.material = material;
        this.stones = stones;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getStones() {
        return stones;
    }

    public void setStones(String stones) {
        this.stones = stones;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = super.hashCode();
        result = result * prime + ((material == null) ? 0 : material.hashCode());
        result = result * prime + (((stones == null)) ? 0 : stones.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bolt other = (Bolt) obj;
        if (material == null) {
            if (other.material != null)
                return false;
        } else if (!material.equals(other.material))
            return false;
        if (stones == null) {
            if (other.stones != null)
                return false;
        } else if (!stones.equals(other.stones))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return material + " BOLT with " + stones + " Price: " + getPrice();
    }
}
