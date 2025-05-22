package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void create() {
        LocalTime localtime1 = LocalTime.now();
        LocalTime localtime2 = LocalTime.of(12, 30, 0);
        LocalTime localtime3 = LocalTime.parse("12:30:00");

        System.out.println(localtime1);
        System.out.println(localtime2);
        System.out.println(localtime3);
    }

    @Test
    void change() {
        LocalTime localtime1 = LocalTime.now();
        LocalTime localtime2 = localtime1.withHour(10);
        LocalTime localtime3 = localtime2.withHour(5).withMinute(30).withSecond(5);

        System.out.println(localtime1);
        System.out.println(localtime2);
        System.out.println(localtime3);
    }

    @Test
    void modified() {
        LocalTime localtime1 = LocalTime.now();
        LocalTime localtime2 = localtime1.plusHours(2);
        LocalTime localtime3 = localtime2.plusHours(4).minusMinutes(10).withSecond(5);

        System.out.println(localtime1);
        System.out.println(localtime2);
        System.out.println(localtime3);
    }

    @Test
    void getData() {
        LocalTime localtime = LocalTime.now();

        System.out.println(localtime.getHour());
        System.out.println(localtime.getMinute());
        System.out.println(localtime.getSecond());
        System.out.println(localtime.getNano());
    }
}
