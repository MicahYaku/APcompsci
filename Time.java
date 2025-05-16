import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Calendar;

public class Time {

    private LocalDateTime dateTime;
    private double unixTime;

    public static void main(String[] args)
    {
        Time a = new Time(timeConv(1747074188.986), 1747074188.986);
        System.out.println(a.toString());
        System.out.println(setTime(2025, 5, 12));
    }

    //Calculate processing time in ms
    public int getPT(int initT, int finaT)
    {
        return finaT - initT;
    }

    //Makes a new date object with type LocalDateTime 
    public Time(LocalDateTime d, double u)
    {
        dateTime = d;
        unixTime = u;
    }

    //Converts parameters (yyyy,mm,dd) into a Unix Timestamp in the form of "long"
    public static long setTime(int day, int month, int year)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        long uTime = calendar.getTimeInMillis();
        return uTime;
    }

    //Returns the year of the LocalDateTime object as an Int
    public int timeYear()
    {
        int year;
        return year = this.dateTime.getYear();
    }

    //Returns the month of the LocalDateTime object as an Int 
    public int timeMonth()
    {
        int month = dateTime.getMonthValue();
        return month;
    }

    //Returns the day of the LocalDateTime object as an Int
    public int timeDay()
    {
        int day = dateTime.getDayOfMonth();
        return day;
    }

    //Converts a Unix Timestamp into a LocalDateTime object
    public static LocalDateTime timeConv(double unixTime)
    {
        long seconds = (long) unixTime;
        long nanoS = (long) (unixTime - seconds) * 1_000_000_000;
        Instant instant = Instant.ofEpochSecond(seconds, nanoS);
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return dateTime;
    }

    //Returns a LocalDateTime object as a String (dd,mm,yyyy)
    public String toString()
    {
        return this.timeDay()+","+this.timeMonth()+","+this.timeYear();
    }

    public double unix()
    {
        return this.unixTime;
    }
}
