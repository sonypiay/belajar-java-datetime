package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeTest {

    @Test
    void create() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Tokyo"));
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime zonedDateTime4 = ZonedDateTime.now(ZoneOffset.ofHours(5));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
        System.out.println(zonedDateTime4);
    }

    @Test
    void parsing() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2020-01-10T12:30:40+09:00[Asia/Tokyo]");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2020-01-10T12:30:40+05:00");

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
    }

    @Test
    void changeZoneId() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = zonedDateTime1.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameLocal(ZoneId.of("Asia/Tokyo"));

        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }
}
