package DatesAndCalendars.datesDemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class HolidaysCount {
    public List<LocalDate> holidays;

    public HolidaysCount(List<LocalDate> holidays) {
        this.holidays = holidays;
    }

    public int numberOfHolidays(int year){
        int count=0;
        for(LocalDate localDate:holidays){
            if(localDate.getYear()==year){
                count++;
            }
        }
        return count;
    }

    public int workingDays(int year){
        int count=0;
        LocalDate startDate=LocalDate.of(year,1,1);
        LocalDate endDate=LocalDate.of(year,12,31);
        while(startDate.isBefore(endDate.plusDays(1))){
            if( !this.isWeekend(startDate)){
                if(!this.isHolidays(startDate)){
                    count++;
                }
            }
            startDate=startDate.plusDays(1);
        }
        return count;
    }

    private boolean isWeekend(LocalDate startDate) {
        DayOfWeek dayOfWeek=startDate.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    private boolean isHolidays(LocalDate startDate) {
        if(holidays.contains(startDate)){
            return true;
        }
        else{
            return false;
        }
    }
}
