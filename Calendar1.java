import java.lang.Object;
import java.lang.String;
import java.lang.Math;

/**
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {
    // Starting the calendar on 1/1/1900
    static int dayOfMonth = 1;
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;     // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January

    /**
     * Prints the calendars of all the years in the 20th century. Also prints the
     * number of Sundays that occured on the first day of the month during this period.
     */
    public static void main(String args[]) {
        
        int debugDaysCounter = 0;

        int sundayCount = 0;

        while (year <= 1999) {

            if(dayOfWeek == 1)
                System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");

            else
                System.out.println(dayOfMonth + "/" + month + "/" + year);


            if(dayOfMonth == 1 && dayOfWeek == 1) {
            sundayCount++;
            }

            advance();

            debugDaysCounter++;

        }

        System.out.println("During the 20th Century, "+sundayCount +" Sundays fell on the first day of the month");
    }

    private static void advance() {

        if(dayOfWeek == 7)
            dayOfWeek = 1;

        else
            dayOfWeek++;


        if(dayOfMonth == nDaysInMonth(month, year) && month != 12){
            month ++;
            dayOfMonth = 1;

        }

        if(dayOfMonth == nDaysInMonth(month, year) && month == 12) {
            year++;
            dayOfMonth = 1;
            month = 1;
        }

        else
            dayOfMonth++;

    }

    public static boolean isLeapYear(int year) {

        boolean isLeapYear;

        isLeapYear = ((year % 4) == 0) && ((year % 100) != 0);

        isLeapYear = isLeapYear || ((year % 400) == 0);

        return isLeapYear;
    }

    public static int nDaysInMonth(int month, int year) {
        int days;

        if( month == 4 || month == 6 || month == 9 || month == 11)
            days = 30;

            // February
        else if (month == 2) {

            if(isLeapYear(year))
                days = 29;
            else
                days = 28;
        }

        else
            days = 31;

        return days;
    }
}