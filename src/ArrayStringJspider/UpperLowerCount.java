package ArrayStringJspider;

import java.util.Scanner;

public class UpperLowerCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value: ");
        String s=sc.nextLine();
        upperLowerCount(s);
    }
    static void upperLowerCount(String s) {
        int upperCount=0;
        int lowerCount=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' ') {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    upperCount++;
                else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    lowerCount++;
            }
        }
        System.out.println("UpperCase count: "+upperCount);
        System.out.println("Lower case count: "+lowerCount);
    }
}
