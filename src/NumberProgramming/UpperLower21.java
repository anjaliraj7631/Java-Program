package NumberProgramming;

import java.util.Scanner;

public class UpperLower21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            if(ch>='A' && ch<='Z'){
                System.out.println(ch+ " in upper case");
            }
            else {
                System.out.println(ch+ "  in lower case");
            }
        }
        else {
            System.out.println(ch+ " not a alpahbet");
        }
    }
}

