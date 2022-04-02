package com.epam.jonline.mod05.a05.bean;

import java.io.Serializable;
import java.util.List;

public class PresentSweet implements Serializable {

    private static final long serialVersionUID = 5L;

    private List<Sweet> sweetList;
    private PackageSweet packageSweet;

    public PresentSweet() {
    }

    public PresentSweet(List<Sweet> sweetList, PackageSweet packageSweet) {
        this.sweetList = sweetList;
        this.packageSweet = packageSweet;
    }

    public List<Sweet> getSweetList() {
        return sweetList;
    }

    public void setSweetList(List<Sweet> sweetList) {
        this.sweetList = sweetList;
    }

    public PackageSweet getPackageSweet() {
        return packageSweet;
    }

    public void setPackageSweet(PackageSweet packageSweet) {
        this.packageSweet = packageSweet;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + ((sweetList == null) ? 0 : sweetList.hashCode());
        result = result * prime + ((packageSweet == null) ? 0 : packageSweet.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PresentSweet other = (PresentSweet) obj;
        if (sweetList == null) {
            if (other.sweetList != null)
                return false;
        } else if (!sweetList.equals(other.sweetList))
            return false;
        if (packageSweet == null) {
            if (other.packageSweet != null)
                return false;
        } else if (!packageSweet.equals(other.packageSweet))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Подарок представляет собой: " + packageSweet.getName(); //+ "\n Список сладостей: \n" + sweetList;
    }

}
