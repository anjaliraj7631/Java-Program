package NumberProgramming;

import java.util.Scanner;

public class MultiWithoutMultiplication39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        int m=0;
        for (int i = 1; i <=10 ; i++) {
            m=m+n;
            System.out.println(m);
        }
    }
}

