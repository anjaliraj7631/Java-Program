package NumberProgramming;

import java.util.Scanner;

public class QuotientWithout37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of m");
        int m=sc.nextInt();
        System.out.println("enter value of n");
        int n=sc.nextInt();
        int quo=0;
        while (m>=n){
            quo++;
            m=m-n;
        }
        System.out.println("Quotient is "+ quo);
    }
}
