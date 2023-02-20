package NumberProgramming;

import java.util.Scanner;

public class SwapWithout02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Before Swapping:" +a +" "+ b);
//        b=a+b;
//        a=b-a;
//        b=b-a;
        b=a*b;
        a=b/a;
        b=b/a;
        System.out.println("After Swapping"+a + " "+b);
    }
}
