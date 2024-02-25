import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class DateTime {
    public static void main(String [] args){
//        Date d = new Date();
//        System.out.println(d.getTime());
//        System.out.println(d.getDate());
//        System.out.println(d);
//        GregorianCalendar gc = new GregorianCalendar();
//        System.out.println(gc.getTime());
//        System.out.println(gc.getTimeZone());
//        System.out.println(gc.isLeapYear(2024));
//        System.out.println(gc.get(Calendar.DATE));
//        System.out.println(gc.get(Calendar.MONTH));
//        System.out.println(gc.get(Calendar.YEAR));
//        TimeZone tz = gc.getTimeZone();
//        System.out.println(tz);
//        System.out.println(tz.getID());
        LocalDate dt = LocalDate.of(2024,7,11); 
        System.out.println(dt);
    }
}
