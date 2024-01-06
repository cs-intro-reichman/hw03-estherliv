/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {
    static int dayOfMonth = 1;
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;
    static int nDaysInMonth = 31;

    public static void main(String args[]) {
        int debugDaysCounter = 0;
        while (year <= 1999) {
            advance();
            debugDaysCounter++;
            if (debugDaysCounter == 36500) {
                break;
            }
            System.out.print(dayOfMonth + "/" + month + "/" + year);
            if (dayOfWeek == 1) {
                System.out.println(" Sunday");
            } else {
                System.out.println();
            }
        }
        System.out.println("During the 20th century, " + countSundays + " Sundays fell on the first day of the month");
    }

    private static void advance() {
        nDaysInMonth = nDaysInMonth(month, year);
        dayOfWeek = (dayOfWeek % 7) + 1;
        dayOfMonth++;
        if (dayOfMonth > nDaysInMonth) {
            dayOfMonth = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int nDaysInMonth(int month, int year) {
        int days;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            if (month == 2) {
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
            } else {
                days = 31;
            }
        }

        return days;
    }
}
