package com.epam.jonline.mod05.a05.view;

import com.epam.jonline.mod05.a05.bean.*;
import com.epam.jonline.mod05.a05.dao.PresentDAO;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ViewAll {
    PresentDAO p = new PresentDAO();

    public void viewPackageAndSweet() throws IOException {
        System.out.println("Все виды упаковок: ");
        System.out.println("------------------------------------------------------------");
        for (PackageSweet ps : p.creatPackageSweetList()) {
            System.out.println(ps.toString());
        }
        System.out.println("Весь ассортимент шоколадных конфет: ");
        System.out.println("------------------------------------------------------------");
        for (Sweet cch : p.creatCandyChocolateList()) {
            System.out.println(cch.toString());
        }
        System.out.println("Весь ассортимент карамельных конфет: ");
        System.out.println("------------------------------------------------------------");
        for (Sweet ccr : p.creatCandyCaramelList()) {
            System.out.println(ccr.toString());
        }
    }

    public void viewPresentSweet(PresentSweet presentSweet, double weight, double price) {

        NumberFormat nf = new DecimalFormat("#.####");
        System.out.println("------------------------------------------------------------");
        System.out.println("Масса нетто:" + nf.format(weight) + "кг");
        System.out.println("Цена: " + nf.format(price) + "руб");
        System.out.println(presentSweet.toString());
        System.out.println("Список сладостей: ");
        for (Sweet s : presentSweet.getSweetList()) {
            System.out.print(s.getName() + " | ");
        }
        System.out.println();
    }

}
