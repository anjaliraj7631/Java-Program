package NumberProgramming;

import java.util.Scanner;

public class CountSpyNum57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int count=0;
        for (int i = 1; i <=n; i++) {
            int sum=0;
            int prod=1;
            int temp=i;
            while (temp>0){
                sum=sum+temp%10;
                prod=prod*(temp%10);
                temp=temp/10;
            }
            if (sum==prod){
                count++;
            }
        }
        System.out.println("Count is: "+count);
    }
}
