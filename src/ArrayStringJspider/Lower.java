package ArrayStringJspider;

import java.util.Scanner;

public class Lower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        String s=sc.nextLine();
        System.out.println(lower(s));
    }

    private static String lower(String s) {
        String res="";
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                c=(char) (c+32);
                res+=c;
            }
            else {
                res+=c;
            }
        }
        return res;
    }
}
