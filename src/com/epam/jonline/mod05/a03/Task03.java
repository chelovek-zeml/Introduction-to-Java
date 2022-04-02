package com.epam.jonline.mod05.a03;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Task03 {
    public static void main(String[] args) {

        Calendar can = new Calendar();

        can.addHoliday(MonthDay.of(Month.JANUARY, 1), "Новый год");
        can.addHoliday(MonthDay.of(Month.JANUARY, 2), "Новый год");
        can.addHoliday(MonthDay.of(Month.JANUARY, 7), "Рождество Христово (православное Рождество)");
        can.addHoliday(MonthDay.of(Month.MARCH, 8), "День женщин");
        can.addHoliday(MonthDay.of(Month.MAY, 1), "Праздник труда");
        can.addHoliday(MonthDay.of(Month.MAY, 3), "Радуница");
        can.addHoliday(MonthDay.of(Month.MAY, 9), "День Победы");
        can.addHoliday(MonthDay.of(Month.JULY, 3), "День Независимости Республики Беларусь (День Республики)");

        can.printHoliday(LocalDate.of(2022,1,1), LocalDate.of(2022,7,31));
    }
}
