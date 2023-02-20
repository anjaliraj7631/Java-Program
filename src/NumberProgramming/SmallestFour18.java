package NumberProgramming;

import java.util.Scanner;

public class SmallestFour18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        System.out.println("Enter foutrh number");
        int d=sc.nextInt();
        String res=a<b && a<c && a<d ? a+"is the smallest": b<c && b<d? b+" is the smallest" : c<d? c+ " is the smallest": d+" is the smallest" ;
        System.out.println(res);
    }
}
