package NumberProgramming;

import java.util.Scanner;

public class Postive08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        if(n>0){
            System.out.println(n+" is Positive NUmber");
        }
        else if(n<0) {
            System.out.println(n+" is negative number");
        }
        else {
            System.out.println(n+" is neither negative nor positive");
        }
    }
}
