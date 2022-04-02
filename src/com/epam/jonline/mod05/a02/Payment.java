package com.epam.jonline.mod05.a02;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private List<Product> productList;

    {
        productList = new ArrayList<>();
    }

    public Payment() {
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList (List<Product> productList) {
        this.productList = productList;
    }

    public boolean addProduct(Product product) {
        return productList.add(product);
    }

    public boolean removeProduct(Product product) {
        return productList.remove(product);
    }

    public static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
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
            result = prime * result + (int) price;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
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
            Product other = (Product) obj;
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
            return "Name: " + name + " Price: " + price + " rub.";
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productList == null) ? 0 : productList.hashCode());
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
        Payment other = (Payment) obj;
        if (productList == null) {
            if (other.productList != null)
                return false;
        } else if (!productList.equals(other.productList))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "productList: " + productList ;
    }
}
