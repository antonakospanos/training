package xj_adv.ch7_datetime.solution721;

import org.junit.*;
import xj_adv.util.*;

import java.util.stream.*;

import static org.junit.Assert.*;

public class DateFormattingHorrorTest {
    @BeforeClass
    public static void setupGCViewerEvent() {
        SuperSimpleGCParser.showGCLogSummaryAtExit();
    }

    @Test(expected = Exception.class)
    public void testLenientDates() {
        DateFormattingHorror horror = new DateFormattingHorror();
        Object heinzBirthday = horror.parse(
                "1971.12.04");
        System.out.println("heinzBirthday = " + heinzBirthday);
    }

    @Test
    public void testRaceConditions() {
        DateFormattingHorror horror = new DateFormattingHorror();
        String today = "25.11.2015";
        long numberOfDates = IntStream.range(0, 10_000_000)
                .parallel()
                .mapToObj(i -> horror.parse(today))
                .distinct().count();
        assertEquals(1, numberOfDates);
    }

    @Test
    public void testTwoDigitYear() {
        DateFormattingHorror horror = new DateFormattingHorror();
        Object todayYY = horror.parse("25.11.15");
        Object todayYYYY = horror.parse("25.11.2015");
        assertEquals(todayYY, todayYYYY);
        System.out.println("today = " + todayYY);
    }

    @Test
    public void testTwoDigitYearShortMonths() {
        DateFormattingHorror horror = new DateFormattingHorror();
        Object todayYY = horror.parse("1.2.15");
        Object todayYYYY = horror.parse("1.2.2015");
        assertEquals(todayYY, todayYYYY);
        System.out.println("today = " + todayYY);
    }
}
