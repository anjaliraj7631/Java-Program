package NumberProgramming;

import java.util.Scanner;

public class DigitAlphaSymbol19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a'&& ch<='z'  || ch>='A' && ch<='Z'){
            System.out.println(ch+ " is a character");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println(ch+ " is a digit");
        }
        else {
            System.out.println(ch+ " is a symbol");
        }
    }
}
