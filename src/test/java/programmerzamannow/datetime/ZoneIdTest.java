package programmerzamannow.datetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneIdTest {

    @Test
    void createZoneId() {
        ZoneId zoneId1 = ZoneId.systemDefault();
        ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");
        ZoneId zoneId3 = ZoneId.of("GMT");

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        System.out.println(zoneId1);
        System.out.println(zoneId2);
        System.out.println(zoneId3);

        for (String zone : availableZoneIds) {
            System.out.println(zone);
        }
    }

    @Test
    void createZoneOffset() {
        ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(7);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(7, 30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }
}
