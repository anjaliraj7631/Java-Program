package simple_alg;

import java.util.Scanner;

public class FibNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int a=0;
        int b=1;
        int c=2;
        while (c<=n){
            int temp=b;
            b=b+a;
            System.out.println(b);
            a=temp;
            c++;
        }
    }
}
