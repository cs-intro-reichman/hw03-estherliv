public class Calendar {

    static int dayOfMonth = 1;
    static int month = 1;
    static int year;
    static int dayOfWeek = 2;
    static int nDaysInMonth = 31;

    public static void main(String args[]) {
        if (args.length != 1 || !isValidYear(args[0])) {
            System.out.println("Invalid input. Usage: java Calendar <year>");
            return;
        }

        year = Integer.parseInt(args[0]);

        if (year < 1900) {
            System.out.println("Please enter a year equal to or after 1900.");
            return;
        }

        while (year > 1900) {
            nDaysInMonth = nDaysInMonth(month, year);
            dayOfWeek = (dayOfWeek % 7) + 1;
            dayOfMonth++;
            if (dayOfMonth > nDaysInMonth) {
                dayOfMonth = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year--;
                }
            }
        }

        while (year == 2021) {
            System.out.print(dayOfMonth + "/" + month + "/" + year);
            if (dayOfWeek == 1) {
                System.out.println(" Sunday");
            } else {
                System.out.println();
            }

            nDaysInMonth = nDaysInMonth(month, year);
            dayOfWeek = (dayOfWeek % 7) + 1;
            dayOfMonth++;

            if (dayOfMonth > nDaysInMonth) {
                dayOfMonth = 1;
                month++;
            }
        }
    }

    private static boolean isValidYear(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
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