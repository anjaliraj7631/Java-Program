package ArrayStringJspider;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value: ");
        String s=sc.nextLine();
        if (palindrome(s)){
            System.out.println(s+" is a Palindrome");
        }
        else {
            System.out.println(s+" is not a Palindrome");
        }

    }
    static boolean palindrome(String s){
        String s1="";
        s1=reverse(s);
        return s.equals(s1);
    }
    private static String reverse(String s) {
        String s1="";
        for (int i = 0; i <s.length() ; i++) {
            s1=s1+s.charAt(s.length()-1-i);

        }
        return s1;
    }
}
