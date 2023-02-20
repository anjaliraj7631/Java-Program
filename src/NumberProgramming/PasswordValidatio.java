package NumberProgramming;

import java.util.Scanner;

public class PasswordValidatio {
    public static boolean isUpperCase(char ch){
        return ch>='A' && ch<='Z';
    }
    public  static boolean isLowerCase(char ch){
        return ch>='a' && ch<='z';
    }
    public  static boolean isNumber(char ch){
        return ch>='0' && ch<='9';
    }
    public static boolean isSpecialCharacter(char ch){
        return !(isLowerCase(ch) || isUpperCase(ch) || isNumber(ch) || ch == ' ');
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();char ch = s.charAt(0);
        boolean isUppercase = isUpperCase(ch);
        boolean isLowercase = isLowerCase(ch);
        boolean isDigit = isNumber(ch);
        boolean isSpecialChar = isSpecialCharacter(ch);
        if (s.length() > 8) {
            if (isUppercase || isLowercase || isDigit || isSpecialChar) {
                System.out.println(s + " is  strong password");
            } else {
                System.out.println("weak password");
            }
        } else {
            System.out.println("The password length should be greater than 8 characters.so it is weak password");
        }
    }

}
