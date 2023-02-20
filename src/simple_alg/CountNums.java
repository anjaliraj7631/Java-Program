package simple_alg;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter NUmber");
        int n= in.nextInt();
        Scanner rept=new Scanner(System.in);
        System.out.println("Enter repeated number occurance");
        int rep= rept.nextInt();
        int count=0;
        while (n>0){
          int  rem=n%10;
            if(rem==rep){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
