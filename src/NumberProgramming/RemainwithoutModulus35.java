package NumberProgramming;

import java.util.Scanner;

public class RemainwithoutModulus35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of m");
        int m=sc.nextInt();
        System.out.println("enter value of n");
        int n=sc.nextInt();
        while (m>=n){
            m=m-n;
        }
        System.out.println("Remainder is "+m);
    }
}
