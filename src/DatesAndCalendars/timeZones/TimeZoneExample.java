package DatesAndCalendars.timeZones;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneExample implements Runnable{
    @Override
    public void run() {
        //UTC
        Instant instant= Instant.now();
        System.out.println(instant);
        ZoneId zoneId1=ZoneId.of("Asia/Kolkata");
        ZoneId zoneId2= ZoneId.of("America/Los_Angeles");
        //convert UTC to timezone
        LocalDateTime localDateTime1=instant.atZone(zoneId2).toLocalDateTime();
        LocalDateTime localDateTime2=instant.atZone(zoneId1).toLocalDateTime();
        System.out.println(localDateTime1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a")));
        System.out.println(localDateTime2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a")));
    }
}
