package com.epam.jonline.mod05.a04.logic;




import java.util.List;

import com.epam.jonline.mod05.a04.bean.Treasure;
import com.epam.jonline.mod05.a04.view.ShowTreasures;

public class TreasureManagment {

    public void mostExpensive(List<Treasure> treasures) {
        double temp = 0;
        ShowTreasures sht = new ShowTreasures();
        for (Treasure treasure : treasures) {
            if (temp < treasure.getPrice()) {
                temp = treasure.getPrice();
            }
        }

        for (Treasure treasure : treasures) {
            if (temp == treasure.getPrice()) {
                sht.showTreasure(treasure);
            }
        }
    }

    public void amountOfTreasures(double a, List<Treasure> list) {
        System.out.println();
        System.out.println("Treasures list for " + a + ": ");
        for (int i = 0; i < list.size(); i++) {
            if (a == list.get(i).getPrice()) {
                System.out.printf("| %45s |\n", list.get(i));
            }
            for (int j = 0; j < list.size(); j++) {
                if ((a == (list.get(i).getPrice() + list.get(j).getPrice())) && (list.get(i).getPrice() < list.get(j).getPrice())){
                    System.out.printf("| %45s | %45s |\n", list.get(i),list.get(j));
                }
                for (int k = 0; k < list.size(); k++) {
                    if ((a == (list.get(i).getPrice() + list.get(j).getPrice() + list.get(k).getPrice())) && (list.get(i).getPrice() < list.get(j).getPrice()) && (list.get(j).getPrice() < list.get(k).getPrice())) {
                        System.out.printf("| %45s | %45s | %45s |\n", list.get(i),list.get(j),list.get(k));
                    }
                    for (int l = 0; l < list.size(); l++) {
                        if ((a == (list.get(i).getPrice() + list.get(j).getPrice() + list.get(k).getPrice() + list.get(l).getPrice())) && (list.get(i).getPrice() < list.get(j).getPrice()) && (list.get(j).getPrice() < list.get(k).getPrice()) && (list.get(k).getPrice() < list.get(l).getPrice())) {
                            System.out.printf("| %45s | %45s | %45s | %45s |\n", list.get(i),list.get(j),list.get(k),list.get(l));
                        }
                    }
                }
            }
        }
    }
}


