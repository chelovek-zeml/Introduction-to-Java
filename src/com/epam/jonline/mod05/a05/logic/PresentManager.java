package com.epam.jonline.mod05.a05.logic;

import com.epam.jonline.mod05.a05.bean.*;
import com.epam.jonline.mod05.a05.dao.PresentDAO;
import com.epam.jonline.mod05.a05.view.ViewAll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PresentManager {

    PresentDAO presentDAO = new PresentDAO();

    ViewAll viewAll = new ViewAll();
    List<Sweet> list = new ArrayList<>();
    List<Sweet> presentSweetList = new ArrayList<>();
    double temp = 0;
    double count = 0;

    {
        try {
            list.addAll(presentDAO.creatCandyCaramelList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            list.addAll(presentDAO.creatCandyChocolateList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void creatPresentWeight(double w) throws IOException {

        double weight = w;
        while (weight > 0) {
            for (Sweet s : list) {
                if (s.getWeight() <= weight) {
                    temp = temp + s.getWeight();
                    count = count + s.getPrice();
                    presentSweetList.add(s);
                }
                weight = weight - s.getWeight();
            }
        }
        for (PackageSweet packageSweet : presentDAO.creatPackageSweetList()) {
            double count1 = count;
            if (w <= packageSweet.getSize()) {
                count1 = count1 + packageSweet.getPrice();
                viewAll.viewPresentSweet(new PresentSweet(presentSweetList, packageSweet), temp, count1);
            }
        }
    }
}



