package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimezoneTest {

    @Test
    void create() {
        TimeZone timezone1 = TimeZone.getDefault();
        TimeZone timezone2 = TimeZone.getTimeZone("Asia/Jakarta");
        TimeZone timezoneGMT = TimeZone.getTimeZone("GMT");
        String[] availableIDs = TimeZone.getAvailableIDs();

        System.out.println(timezone1);
        System.out.println(timezone2);
        System.out.println(timezoneGMT);

        Arrays.asList(availableIDs).forEach(System.out::println);
    }

    @Test
    void date() {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
    }

    @Test
    void calendar() {
        Calendar calendarJakarta = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar calendarGMT = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendarGMT.get(Calendar.HOUR_OF_DAY));

        calendarJakarta.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
    }
}
