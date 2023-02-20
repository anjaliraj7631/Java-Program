package NumberProgramming;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
        System.out.println("Enter Choice:");
        int ch=sc.nextInt();
        System.out.println("Enter first number:");
        int n1= sc.nextInt();
        System.out.println("Enter second number:");
        int n2=sc.nextInt();
        if(ch==1){
            System.out.println("Addition: "+sum(n1,n2));
        } else if (ch==2) {
            System.out.println("Subtrsction: "+sub(n1,n2));
        } else if (ch==3) {
            System.out.println("Multiplication: "+mul(n1,n2));
        } else if (ch==4) {
            System.out.println("Division: "+div(n1,n2));
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
    public static int sum(int a,int b) {
        return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static int mul(int a, int b) {
        return a*b;
    }
    public static int div(int a, int b) {
        return a/b;
    }
}
