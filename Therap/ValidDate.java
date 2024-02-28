package Therap;

public class ValidDate {
    public static void main(String[] args) {
        String date = "2023-04-31";

        if (isValidDate(date)) {
            System.out.println("Valid date.");
        } else {
            System.out.println("Invalid date.");
        }
    }

    public static boolean isValidDate(String date) {
        if (date.length() != 10) {
            return false;
        }

        String[] parts = date.split("-");
        if (parts.length != 3) {
            return false;
        }

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false; // April, June, September, and November have 30 days
        }

        // if(month == 2){}

        return true;
    }

    // isLeapYear()

}
