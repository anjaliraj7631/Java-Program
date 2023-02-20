package NumberProgramming;

import java.util.Scanner;

public class CountAutobiographic60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int count=0;
        for (int i = 1; i <=n; i++) {
            int sum=0;
            int c=0;
            int temp=i;
            while (temp>0){
                c++;
                sum=sum+temp%10;
                temp=temp/10;
            }
            if (sum==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
