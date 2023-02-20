package NumberProgramming;

import java.util.Scanner;

public class SmallestTwo11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        String res=a<b ? a+" is the smallest": b+" is the smallest"  ;
        System.out.println(res);
    }
}
