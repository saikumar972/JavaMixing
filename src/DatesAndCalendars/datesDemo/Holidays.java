package DatesAndCalendars.datesDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Holidays implements Runnable{

    @Override
    public void run() {
        List<LocalDate> holidays= new ArrayList<>();
        // Notable Indian public holidays in 2025
        holidays.add(LocalDate.of(2025, 1, 26)); // Republic Day
        holidays.add(LocalDate.of(2025, 3, 31)); // Holi (may vary regionally)
        holidays.add(LocalDate.of(2025, 4, 10)); // Good Friday
        holidays.add(LocalDate.of(2025, 4, 14)); // Ambedkar Jayanti
        holidays.add(LocalDate.of(2025, 5, 30)); // Eid al-Adha (tentative)
        holidays.add(LocalDate.of(2025, 8, 15)); // Independence Day
        holidays.add(LocalDate.of(2025, 10, 2)); // Gandhi Jayanti
        holidays.add(LocalDate.of(2025, 10, 20)); // Diwali (tentative)
        holidays.add(LocalDate.of(2025, 10, 22)); // Bhai Dooj
        holidays.add(LocalDate.of(2025, 12, 25)); // Christmas
        HolidaysCount holidaysCount= new HolidaysCount(holidays);
        int numberOfHolidays=holidaysCount.numberOfHolidays(2025);
        int numberOfWorkingDays=holidaysCount.workingDays(2025);
        System.out.println(numberOfHolidays);
        System.out.println(numberOfWorkingDays);
    }
}
