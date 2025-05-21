package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
}
