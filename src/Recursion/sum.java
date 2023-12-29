package Recursion;

import java.util.Scanner;

public class sum {
   static int sum=0;

    public static int sum(int n){
        if(n==6)
            return 0;
//        return sum;
//        sum=sum+n;
        return n+sum(n+1);
    }
    public static int mul(int n){
        if(n==6)
            return 1;
        return n*mul(n+1);
    }
    public static int oddSum(int n){
        if(n==11)
            return 0;
            return n+oddSum(n+2);
    }
    public static void oddNum(int m, int n){
        if(m==n+1)
            return ;
        if(m%2==1)
            System.out.println(m);
        oddNum(m+1,n);
    }
    public void even(int m,int n){
        if (m==n+2)
            return;
    }
    public static int sumRange(int n,int m){
        if(n==m+1)
            return 0;
        return n+sumRange(n+1,m);
    }

    public static void main(String[] args) {
//        System.out.println(sum(1));
//        System.out.println(oddSum(1));
//        System.out.println(mul(1));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range");
        int m=sc.nextInt();
        System.out.println("Enter the end range");
        int n=sc.nextInt();
//        System.out.println(sumRange(m,n));
            oddNum(m,n);
//        System.out.println(sum(n));
    }
}
