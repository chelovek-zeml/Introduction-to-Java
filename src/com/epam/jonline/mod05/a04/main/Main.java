package com.epam.jonline.mod05.a04.main;




import java.io.IOException;
import java.util.List;

import com.epam.jonline.mod05.a04.bean.Treasure;
import com.epam.jonline.mod05.a04.dao.DragonCave;
import com.epam.jonline.mod05.a04.logic.TreasureManagment;
import com.epam.jonline.mod05.a04.view.ShowTreasures;

public class Main {

    /*Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона.  Реализовать  возможность  просмотра  сокровищ,  выбора  самого  дорогого  по  стоимости  сокровища  и
выбора сокровищ на заданную сумму.*/
    public static void main(String[] args) throws IOException {

        DragonCave dc = new DragonCave();
        TreasureManagment tm = new TreasureManagment();
        ShowTreasures st = new ShowTreasures();

        List<Treasure> treasureList = dc.creatTreasureList();
        st.showTreasures(treasureList);
        tm.mostExpensive(treasureList);
        tm.amountOfTreasures(350, treasureList);
    }
}
