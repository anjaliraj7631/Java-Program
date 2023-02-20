package ArrayStringJspider;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value: ");
        String s= sc.nextLine();
        length(s);
    }

    private static void length(String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}
