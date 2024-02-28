import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidPhoneNumber {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "(\\+88|88)?(01[3-9]\\d{8})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+8801812598624";
        String phoneNumber2 = "01812598624";
        String phoneNumber3 = "0191959864";

        System.out.println(phoneNumber1 + " is valid: " + isValidPhoneNumber(phoneNumber1));
        System.out.println(phoneNumber2 + " is valid: " + isValidPhoneNumber(phoneNumber2));
        System.out.println(phoneNumber3 + " is valid: " + isValidPhoneNumber(phoneNumber3));
    }
}
