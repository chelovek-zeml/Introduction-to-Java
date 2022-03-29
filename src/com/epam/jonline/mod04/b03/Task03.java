package com.epam.jonline.mod04.b03;

public class Task03 {
	public static void main(String[] args) {
		System.out.println("3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль "
				+ "столицу, количество областей, площадь, областные центры.");
		System.out.println();
		
		Country country = new Country("Беларусь", "Минск", 206.7);

        country.addCity(new City("Гродно"));
        country.addCity(new City("Витебск"));

        country.addDistrict(new District("Минский"));

        country.addRegion(new Region("Минская", "Минск"));
        country.addRegion(new Region("Брестская", "Брест"));
        country.addRegion(new Region("Могилевская", "Могилев"));
        country.addRegion(new Region("Гомельская", "Гомель"));
        country.addRegion(new Region("Витебская", "Витебск"));
        country.addRegion(new Region("Гродненская", "Гродно"));
        
        country.sortByName();
        
        System.out.println("Столица: " + country.getCapital());
        System.out.println("Количество областей: " + country.getRegionList().size());
        System.out.println("Площадь: " + country.getSquare());
        System.out.println("Областные");
        System.out.println("  центры: ");
        for (int i = 0; i < country.getRegionList().size(); i++) {
            System.out.print("          ");
            System.out.println(country.getRegionList().get(i).getRegional_center());
        }
	}
}
