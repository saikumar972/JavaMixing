package DatesAndCalendars.calendar;

import java.util.Calendar;

public class CalendarExample implements Runnable{

    @Override
    public void run() {
        Calendar c1=Calendar.getInstance();
        String s1=covertCalendatToString(c1);
        System.out.println(s1);
        c1.set(1999,Calendar.JANUARY,10);
        String s2=covertCalendatToString(c1);
        System.out.println(s2);
        c1.add(Calendar.MONTH,3);
        String s3=covertCalendatToString(c1);
        System.out.println(s3);
    }

    private String covertCalendatToString(Calendar c) {
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);
        int hour=c.get(Calendar.HOUR_OF_DAY);
        int minutes=c.get(Calendar.MINUTE);
        int seconds=c.get(Calendar.SECOND);
        return String.format("%04d/%02d/%02d %02d:%02d:%02d ",year,month,day,hour,minutes,seconds);
    }
}
