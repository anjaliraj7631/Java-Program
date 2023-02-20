package simple_alg;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+ " " +b);
        int count=2;
        while (count<n){
            int c=a+b;
            System.out.print(" " + c);
            a=b;
            b=c;
            count++;
        }
    }
}
