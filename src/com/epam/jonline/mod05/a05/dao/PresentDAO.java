package com.epam.jonline.mod05.a05.dao;

import com.epam.jonline.mod05.a05.bean.CandyCaramel;
import com.epam.jonline.mod05.a05.bean.CandyChocolate;
import com.epam.jonline.mod05.a05.bean.PackageSweet;
import com.epam.jonline.mod05.a05.bean.Sweet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PresentDAO {
    private final List<PackageSweet> packageSweet;
    private final List<Sweet> candyCaramelList;
    private final List<Sweet> candyChocolateList;

    {
        packageSweet = new ArrayList<>();
        candyCaramelList = new ArrayList<>();
        candyChocolateList = new ArrayList<>();
    }

    public List<Sweet> creatCandyCaramelList() throws IOException {
        List<String> tempList;
        final String workDir = System.getProperty("user.dir");
        tempList = creatList(workDir + "/src/com/epam/jonline/mod05/a05/source/candyCaramel");
        for (String s : tempList) {
            String name = s.split("\\|")[0];
            double weight = Double.parseDouble(s.split("\\|")[1]);
            double price = Double.parseDouble(s.split("\\|")[2]);
            candyCaramelList.add(new CandyCaramel(name, weight, price));
        }
        return candyCaramelList;
    }

    public List<Sweet> creatCandyChocolateList() throws IOException {
        List<String> tempList;
        final String workDir = System.getProperty("user.dir");
        tempList = creatList(workDir + "/src/com/epam/jonline/mod05/a05/source/candyChocolate");
        for (String s : tempList) {
            String name = s.split("\\|")[0];
            double weight = Double.parseDouble(s.split("\\|")[1]);
            double price = Double.parseDouble(s.split("\\|")[2]);
            candyChocolateList.add(new CandyChocolate(name, weight, price));
        }
        return candyChocolateList;
    }

    public List<PackageSweet> creatPackageSweetList() throws IOException {
        List<String> tempList;
        final String workDir = System.getProperty("user.dir");
        tempList = creatList(workDir + "/src/com/epam/jonline/mod05/a05/source/packageSweet");
        for (String s : tempList) {
            String name = s.split("\\|")[0];
            double weight = Double.parseDouble(s.split("\\|")[1]);
            double price = Double.parseDouble(s.split("\\|")[2]);
            packageSweet.add(new PackageSweet(name, weight, price));
        }
        return packageSweet;
    }

    public List<String> creatList(String s) throws IOException {
        BufferedReader in;
        FileReader fr;
        List<String> list = new ArrayList<>();
        fr = new FileReader(s);
        in = new BufferedReader(fr);
        String str;
        while (true) {
            if ((str = in.readLine()) == null) break;
            list.add(str);
        }
        return list;
    }
}
