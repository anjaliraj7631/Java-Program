package NumberProgramming;

import java.util.Scanner;

public class SmallestThree14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        String res=a<b && a<c ? a+"is the smallest": b<c? b+" is the smallest" : c+ " is the smallest" ;
        System.out.println(res);
    }
}
