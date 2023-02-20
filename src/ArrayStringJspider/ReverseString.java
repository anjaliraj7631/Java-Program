package ArrayStringJspider;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value: ");
        String s=sc.nextLine();
        System.out.println("Before reverse: "+s);
        reverse(s);
    }

    private static void reverse(String s) {
        String s1="";
//        for (int i = s.length()-1; i >=0; i--) {
//            s1=s1+s.charAt(i);
//        }
        for (int i = 0; i <s.length() ; i++) {
            s1=s1+s.charAt(s.length()-1-i);

        }
        System.out.println("After reverse: "+s1);
    }


}
