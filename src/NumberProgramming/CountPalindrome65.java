package NumberProgramming;

import java.util.Scanner;

public class CountPalindrome65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int count=0;
        for (int i = 1; i <=n; i++) {
            int rev=0;
            int temp=i;
            while (temp>0){
                rev=rev*10+temp%10;
                temp=temp/10;
            }
            if (rev==i){
                count++;
            }
        }
        System.out.println(count);
    }
}
