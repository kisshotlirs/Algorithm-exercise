package math;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author: zyl
 * @description: 日期之间隔几天
 */
public class L1360 {

    public int daysBetweenDates(String date1, String date2) {
        LocalDate start = LocalDate.parse(date1);
        LocalDate end = LocalDate.parse(date2);

        int between = (int) ChronoUnit.DAYS.between(start, end);
        return end.isAfter(start) ? between : -between;
    }
}
