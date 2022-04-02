package com.epam.jonline.mod05.a03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashMap;
import java.util.Map;


public class Calendar {
    private final HashMap<MonthDay, String> map = new HashMap<>();
    private final Holiday holiday;

    public Calendar() {
        this.holiday = new Holiday();
    }

    public void addHoliday(MonthDay monthDay, String s) {
        map.put(monthDay, s);
    }

    public void printHoliday(LocalDate ld1, LocalDate ld2) {
        System.out.println("Total holidays: " + holiday.totalHoliday(ld1, ld2));
        for (LocalDate i = ld1; !i.isAfter(ld2); i = i.plusDays(1)) {
            if (holiday.isHoliday(i)) {
                System.out.print(i + " " + i.getDayOfWeek());
                for (Map.Entry<MonthDay, String> entry : map.entrySet()) {
                    if (entry.getKey().equals(MonthDay.of(i.getMonth(), i.getDayOfMonth()))) {
                        System.out.print(" --- " + entry.getValue());
                    }
                }
                System.out.println();
            }
        }
    }


    public class Holiday {
        public boolean isHoliday(LocalDate ld) {
            return isWeekend(ld) || map.containsKey(toMonthDay(ld));
        }

        public boolean isWeekend(LocalDate ld) {
            DayOfWeek d = ld.getDayOfWeek();
            return d.equals(DayOfWeek.SATURDAY) || d.equals(DayOfWeek.SUNDAY);
        }

        public MonthDay toMonthDay(LocalDate ld) {
            return MonthDay.of(ld.getMonth(), ld.getDayOfMonth());
        }

        public int totalHoliday(LocalDate ld1, LocalDate ld2) {
            int t = 0;
            for (LocalDate i = ld1; !i.isAfter(ld2); i = i.plusDays(1)) {
                if (isHoliday(i)) {
                    t++;
                }
            }
            return t;
        }
    }
}



