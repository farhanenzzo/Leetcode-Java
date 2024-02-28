package Therap;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        String phoneNumber = "01912740283";

        if (isValidBangladeshPhoneNumber(phoneNumber)) {
            System.out.println("Valid BD phone number.");
        } else {
            System.out.println("Invalid BD phone number.");
        }
    }

    public static boolean isValidBangladeshPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }

        String[] validPrefixes = {"017", "018", "019", "015", "013", "014", "016"};
        String prefix = phoneNumber.substring(0, 3);

        for (String validPrefix : validPrefixes) {
            if (prefix.equals(validPrefix)) {
                return true;
            }
        }
        return false;
    }
}
