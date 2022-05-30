package homework_7_2;

import java.lang.reflect.Array;

public class MonthUtils {
    private static Month[] MONTH_ARRAY = {
            new Month("Jan", 31, 24),
            new Month("Feb", 28, 19),
            new Month("Mar", 31, 24),
            new Month("Apr", 30, 23),
            new Month("May", 31, 24),
            new Month("Jun", 30, 23),
            new Month("Jul", 31, 24),
            new Month("Aug",31, 24),
            new Month("Sep",30, 23),
            new Month("Oct", 31, 24),
            new Month("Nov",30, 23),
            new Month("Dec", 31, 24)
    };

    public static Month[] getMonthArray() {
        return MONTH_ARRAY;
    }
}
