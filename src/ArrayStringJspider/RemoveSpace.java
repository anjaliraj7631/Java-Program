package ArrayStringJspider;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value: ");
        String s=sc.nextLine();
        removeSpace(s);
    }
    static void removeSpace(String s) {
        String result="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' '){
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
