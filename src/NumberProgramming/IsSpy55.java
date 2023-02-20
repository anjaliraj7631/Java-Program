package NumberProgramming;

import java.util.Scanner;

public class IsSpy55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
        int temp=n;
        int sum=0;
        int prod=1;
        while (n>0){
            sum=sum+n%10;
            prod=prod*(n%10);
            n=n/10;
        }
        if (sum==prod){
            System.out.println(temp+" is a spy number");
        }
        else {
            System.out.println(temp+" is not a spy number");
        }
    }
}
