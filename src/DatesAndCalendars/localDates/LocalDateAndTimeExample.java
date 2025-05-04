package DatesAndCalendars.localDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateAndTimeExample implements Runnable{
    @Override
    public void run() {
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        //print formated ones
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        //set the specific date
        LocalDate localDate1=LocalDate.of(2024,9,21);
        LocalTime localTime1=LocalTime.of(12,34,19,45);
        LocalDateTime localDateTime1=LocalDateTime.of(localDate1,localTime1);
        System.out.println(localDate1);
        System.out.println(localTime1);
        System.out.println(localDateTime1);
        //add days, months, years
        LocalDate localDate2=localDate1.minusYears(3);
        LocalDate localDate3=localDate1.plusMonths(1);
        LocalDate localDate4=localDate1.plusDays(1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);
        //before after or equal
        System.out.println(localDate.isBefore(localDate1));
        System.out.println(localTime.isAfter(localTime1));
        //days between
        System.out.println(ChronoUnit.DAYS.between(localDate1,localDate2));
    }
}
