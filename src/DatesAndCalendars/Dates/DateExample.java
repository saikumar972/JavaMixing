package DatesAndCalendars.Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample implements Runnable{

    @Override
    public void run() {
        Date date1=new Date();
        System.out.println(date1);
        SimpleDateFormat s1=new SimpleDateFormat("dd:MM:yyyy HH:mm:ss");
        SimpleDateFormat s2=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat s3=new SimpleDateFormat("HH:mm:ss");
        String formatedDate1=s1.format(date1);
        String formatedDate2=s2.format(date1);
        String formatedDate3=s3.format(date1);
        System.out.println(formatedDate1);
        System.out.println(formatedDate2);
        System.out.println(formatedDate3);
        //Manipulate Date fields with Calendar
        Calendar c= Calendar.getInstance();
        c.setTime(date1);
        c.add(Calendar.MONTH,5);
        System.out.println(c);
        Date manipulatedDate=c.getTime();
        System.out.println(manipulatedDate);
        //comparing Dated
        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis() + 10000); // 10 seconds later
        boolean isBefore = d1.before(d2);
        boolean isAfter = d1.after(d2);
        boolean isEqual = d1.equals(d2);
        System.out.println(isBefore);
        System.out.println(isAfter);
        System.out.println(isEqual);
        //time in millis
        long timestamp = date1.getTime(); // milliseconds since epoch
        System.out.println(timestamp);
        //parse String to date
        String dateInString="04/12/1969";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate= null;
        try {
            parsedDate = simpleDateFormat.parse(dateInString);
            System.out.println("parsed date "+parsedDate);
            System.out.println(simpleDateFormat.format(parsedDate));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
