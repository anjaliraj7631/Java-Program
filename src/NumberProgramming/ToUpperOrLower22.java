package NumberProgramming;

import java.util.Scanner;

public class ToUpperOrLower22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            if(ch>='A' && ch<='Z') {
                int a=ch+32;
                ch=(char) a;
                System.out.println(ch);
            }
            else {
                int a=ch-32;
                ch=(char) a;
                System.out.println(ch);
            }
        }
        else {
            System.out.println(ch+ " not a alpahbet");
        }
    }
}
