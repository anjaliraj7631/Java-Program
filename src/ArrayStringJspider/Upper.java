package ArrayStringJspider;

import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        String s=sc.nextLine();
        System.out.println( upper(s));
    }

    private static String upper(String s) {
        String res="";
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                c=(char) (c-32);
                res+=c;
            }
            else {
                res+=c;
            }
        }
        return res;
    }

}
