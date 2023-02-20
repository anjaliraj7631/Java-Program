package NumberProgramming;

import java.util.Scanner;

public class PhoneNumberVali {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter a 10-digit phone number: ");
        long num= sc.nextLong();
        long c=0;
        boolean exist=false;
        while (num>0){
            c++;
            num=num/10;
        }

        if(c==10){
            isValid = true;
            System.out.println("valid");
        }
        else{
            isValid = false;
            System.out.println("invalid");
        }
    }}
}
