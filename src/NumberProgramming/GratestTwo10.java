package NumberProgramming;

import java.util.Scanner;

public class GratestTwo10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        String res=a>b ? a+"is the greatest": b+" is the greatest"  ;
        System.out.println(res);
    }
}
