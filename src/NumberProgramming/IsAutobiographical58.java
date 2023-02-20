package NumberProgramming;

import java.util.Scanner;

public class IsAutobiographical58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        int temp=n;
        while (n>0){
            count++;
            sum=sum+n%10;
            n=n/10;
        }
        if (count==sum){
            System.out.println(temp+" is a autobiographical");
        }
        else {
            System.out.println(temp+" is not a autobiographical");
        }
    }
}
