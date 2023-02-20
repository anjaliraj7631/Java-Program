package NumberProgramming;

import java.util.Scanner;

public class IsPalindrome63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while (n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if (rev==temp){
            System.out.println(temp+" is a palindrome number");
        }
        else {
            System.out.println(temp+" is not a palindrome number");
        }
    }
}
