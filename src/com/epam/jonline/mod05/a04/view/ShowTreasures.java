package com.epam.jonline.mod05.a04.view;



import java.util.List;

import com.epam.jonline.mod05.a04.bean.Treasure;

public class ShowTreasures {

    public void showTreasures(List<Treasure> treasures) {
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
        }
    }

    public void showTreasure(Treasure treasure) {
        System.out.println();
        System.out.println("Most Treasure: ");
        System.out.println(treasure.toString());
    }
}
