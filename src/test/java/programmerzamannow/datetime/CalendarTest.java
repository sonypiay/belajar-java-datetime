package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    @Test
    void calendarTest() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void modifiedCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 40);
        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void getCalendar() {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));
    }
}
