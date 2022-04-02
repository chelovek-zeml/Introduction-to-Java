package com.epam.jonline.mod05.a04.dao;

import com.epam.jonline.mod05.a04.bean.Bolt;
import com.epam.jonline.mod05.a04.bean.Bracelet;
import com.epam.jonline.mod05.a04.bean.Chain;
import com.epam.jonline.mod05.a04.bean.Ring;
import com.epam.jonline.mod05.a04.bean.Treasure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DragonCave {

    List<String> materials;
    List<String> stones;
    private List<Treasure> treasures;

    {
        treasures = new ArrayList<>();
    }

    public DragonCave() {
    }

    public List<Treasure> getTreasureList() {
        return treasures;
    }

    public void setTreasureList(List<Treasure> treasureList) {
        this.treasures = treasureList;
    }

    public List<Treasure> creatTreasureList() throws IOException {


        final String workDir = System.getProperty("user.dir");
        materials = creatList(workDir + "/src/com/epam/jonline/mod05/a04/source/materials");
        stones = creatList(workDir + "/src/com/epam/jonline/mod05/a04/source/stones");

        for (String m : materials) {
            for (String s : stones) {

                double p1 = Double.parseDouble(m.replaceAll("\\D", ""));
                double p2 = Double.parseDouble(s.replaceAll("\\D", ""));
                double p = p1 + p2;
                treasures.add(new Ring(m.replaceAll("\\d", ""), " ", s.replaceAll("\\d", ""), p));
                treasures.add(new Bolt(m.replaceAll("\\d", ""), " ", s.replaceAll("\\d", ""), p));
                treasures.add(new Bracelet(m.replaceAll("\\d", ""), " ", s.replaceAll("\\d", ""), p));
                treasures.add(new Chain(m.replaceAll("\\d", ""), " ", s.replaceAll("\\d", ""), p));
            }
        }

        return treasures;
    }

    public List<String> creatList(String s) throws IOException {
        BufferedReader in;
        FileReader fr;
        List<String> list = new ArrayList<>();
        fr = new FileReader(s);
        in = new BufferedReader(fr);
        String str;
        while ((str = in.readLine()) != null) {
            list.add(str);
        }
        return list;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + ((treasures == null) ? 0 : treasures.hashCode());
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
        DragonCave other = (DragonCave) obj;
        if (treasures == null) {
            if (other.treasures != null)
                return false;
        } else if (!treasures.equals(other.treasures))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Treasures: " + treasures;
    }

}
