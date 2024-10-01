package my;

public class Calculate {
    public static int daysInYear = 0;
    public static boolean checkYear (int year, int days) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            daysInYear = 366;
        } else {
            daysInYear = 365;
        }
        return daysInYear == days ? true : false;
    }
    public static int daysInYearGet () {
        return daysInYear;
    }
}
