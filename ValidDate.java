public class ValidDate {

    public static boolean isValidDate(String dateStr) {
        if (dateStr == null || dateStr.length() != 10) {
            return false;
        }

        // Extract year, month, and day components
        String yearStr = dateStr.substring(0, 4);
        System.out.println(yearStr);
        String monthStr = dateStr.substring(5, 7);
        System.out.println(monthStr);
        String dayStr = dateStr.substring(8, 10);
        System.out.println(dayStr );
        // Convert components to integers
        int year, month, day;
        try {
            year = Integer.parseInt(yearStr);
            month = Integer.parseInt(monthStr);
            day = Integer.parseInt(dayStr);
        } catch (NumberFormatException e) {
            return false;
        }

        // Validate year, month, and day
        return isValidYear(year) && isValidMonth(month) && isValidDay(year, month, day);
    }

    private static boolean isValidYear(int year) {
        return year >= 0 && year <= 9999;
    }

    private static boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private static boolean isValidDay(int year, int month, int day) {
        if (day < 1) {
            return false;
        }

        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return day <= 29;
                } else {
                    return day <= 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return day <= 30;
            default:
                return day <= 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        String dateStr = "2023-08-09";
        boolean isValid = isValidDate(dateStr);
        System.out.println("Is valid date? " + isValid);
    }
}
