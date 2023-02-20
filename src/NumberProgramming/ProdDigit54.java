package NumberProgramming;

import java.util.Scanner;

public class ProdDigit54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n= sc.nextInt();
        int prod=1;
        while (n>0){
            prod=prod*(n%10);
            n=n/10;
        }
        System.out.println("Product is:"+prod);
    }
}
