package ArrayStringJspider;

import java.util.Scanner;

public class CountLengthWithoutSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value: ");
        String s=sc.nextLine();
        removeSpace(s);
    }
    static void removeSpace(String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
