package NumberProgramming;

import java.util.Scanner;

public class Digit09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        if(n>=0 && n<=9){
            System.out.println(n+ " is a digit");
        }
        else {
            System.out.println(n+" is not a digit");
        }
    }
}
