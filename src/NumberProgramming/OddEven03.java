package NumberProgramming;

import java.util.Scanner;

public class OddEven03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        if(n%2==1){
            System.out.println(n+" is Odd NUmber");
        }
        else {
            System.out.println(n+" is even number");
        }
    }
}
