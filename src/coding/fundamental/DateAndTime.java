package coding.fundamental;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        var start = LocalDate.of(1991, Month.FEBRUARY, 12);
        var end = LocalDate.of(2025, Month.MAY, 1);
        // System.out.println(Period.between(start, end));

        // try {
        // var now = Instant.now();
        // Thread.sleep(1000);
        // var later = Instant.now();
        // var dura = Duration.between(now, later);
        // System.out.println(dura.toMillis());
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        var date = LocalDate.of(2025, 5, 3);
        date.plusDays(2);
        date.plusMonths(01);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

    }
}
