package NumberProgramming;

import java.util.Scanner;

public class AllAutobiographical59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            int temp=i;
            int sum=0;
            int count=0;
            while (temp>0){
                count++;
                sum=sum+temp%10;
                temp=temp/10;
            }
            if (sum==count){
                System.out.println("Autobiographical Number is: "+i);
            }
        }
    }
}
