package NumberProgramming;

import java.util.Scanner;

public class SwapUsingThird01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c;
        System.out.println("Before Swapping:" +a +" "+ b);
        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping"+a + " "+b);
    }
}
