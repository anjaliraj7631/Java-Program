package ExceptionHandling;
import java.util.ArrayList;
import java.util.List;

public class PasswordSanitizer {
    public static List<String> filter(List<String> passwords) {
        List<String> validPasswords = new ArrayList<>();
        for (String password : passwords) {
            if (password.length() >= 5 && !isAllDigits(password) && !isAllCharacters(password)) {
                validPasswords.add(password);
            }
        }
        return validPasswords;
    }
    private static boolean isAllDigits(String str) {
        return str.matches("\\d+");
    }
    private static boolean isAllCharacters(String str) {
        return str.matches("[a-zA-Z]+");
    }
    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>();
        passwords.add("pecl");
        passwords.add("pass@123");
        passwords.add("word@321");
        passwords.add("wordpass");
        passwords.add("987345");
        List<String> filteredPasswords = filter(passwords);
        for (String password : filteredPasswords) {
            System.out.println(password);
        }
    }
}