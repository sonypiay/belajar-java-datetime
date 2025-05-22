package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {

    @Test
    void create() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, Month.JANUARY, 10, 12, 30, 40);
        LocalDateTime localDateTime3 = LocalDateTime.parse("2020-01-10T12:30:40");

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void change() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.withYear(2020);
        LocalDateTime localDateTime3 = localDateTime2.withYear(2021).withMonth(1);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void modified() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.plusYears(5);
        LocalDateTime localDateTime3 = localDateTime1.plusYears(5).plusMonths(12).minusMonths(2);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void getData() {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
    }

    @Test
    void convertDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        LocalDateTime result = localDate.atTime(10, 10, 10, 400);
        System.out.println(result);
    }

    @Test
    void convertTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        LocalDateTime result = localTime.atDate(LocalDate.now());
        System.out.println(result);
    }
}
